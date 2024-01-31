package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * AspectGroup
 */
@Setter
public class AspectGroup {
    @SerializedName("aspects")
    private List<Aspect> aspects = null;

    @SerializedName("localizedGroupName")
    private String localizedGroupName = null;

    public AspectGroup aspects(List<Aspect> aspects) {
        this.aspects = aspects;
        return this;
    }

    public AspectGroup addAspectsItem(Aspect aspectsItem) {
        if (this.aspects == null) {
            this.aspects = new ArrayList<>();
        }
        this.aspects.add(aspectsItem);
        return this;
    }

    /**
     * An array of the name/value pairs for the aspects of the product. For example: BRAND/Apple
     *
     * @return aspects
     **/
    @Schema(description = "An array of the name/value pairs for the aspects of the product. For example: BRAND/Apple")
    public List<Aspect> getAspects() {
        return aspects;
    }

    public AspectGroup localizedGroupName(String localizedGroupName) {
        this.localizedGroupName = localizedGroupName;
        return this;
    }

    /**
     * The name of a group of aspects. <br><br>In the following example, <b> Product Identifiers</b> and <b>
     * Process </b> are product aspect group names. Under the group name are the product aspect name/value pairs.
     * <p><b> Product Identifiers</b> <br>&nbsp;&nbsp;&nbsp;Brand/Apple <br>&nbsp;&nbsp;&nbsp;Product Family/iMac</p>
     * <p><b> Processor</b><br>&nbsp;&nbsp;&nbsp;Processor Type/Intel <br>&nbsp;&nbsp;&nbsp;Processor Speed/3.10</p>
     *
     * @return localizedGroupName
     **/
    @Schema(description = "The name of a group of aspects. <br><br>In the following example, <b> Product Identifiers</b> " +
            "and <b> Process</b> are product aspect group names. Under the group name are the product aspect " +
            "name/value pairs. <p><b> Product Identifiers</b> <br>&nbsp;&nbsp;&nbsp;Brand/Apple " +
            "<br>&nbsp;&nbsp;&nbsp;Product Family/iMac</p> <p><b> Processor</b><br>&nbsp;&nbsp;&nbsp;Processor " +
            "Type/Intel <br>&nbsp;&nbsp;&nbsp;Processor Speed/3.10</p> ")
    public String getLocalizedGroupName() {
        return localizedGroupName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AspectGroup aspectGroup = (AspectGroup) o;
        return Objects.equals(this.aspects, aspectGroup.aspects) &&
                Objects.equals(this.localizedGroupName, aspectGroup.localizedGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspects, localizedGroupName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AspectGroup {\n");
        sb.append("    aspects: ").append(toIndentedString(aspects)).append("\n");
        sb.append("    localizedGroupName: ").append(toIndentedString(localizedGroupName)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

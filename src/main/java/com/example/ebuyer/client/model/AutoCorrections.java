package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * AutoCorrections
 */
@Setter
public class AutoCorrections {
    @SerializedName("q")
    private String q = null;

    public AutoCorrections q(String q) {
        this.q = q;
        return this;
    }

    /**
     * The automatically spell-corrected keyword from the request.
     *
     * @return q
     **/
    @Schema(description = "The automatically spell-corrected keyword from the request.")
    public String getQ() {
        return q;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoCorrections autoCorrections = (AutoCorrections) o;
        return Objects.equals(this.q, autoCorrections.q);
    }

    @Override
    public int hashCode() {
        return Objects.hash(q);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoCorrections {\n");
        sb.append("    q: ").append(toIndentedString(q)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

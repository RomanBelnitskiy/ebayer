package com.example.ebuyer.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.example.ebuyer.client.StringUtil.toIndentedString;

/**
 * The type that defines the fields for a paginated result set. The response consists of 0 or more
 * sequenced <em> pages</em> where each page has 0 or more items.
 */
@Setter
@Schema(description = "The type that defines the fields for a paginated result set. The response consists " +
        "of 0 or more sequenced <em> pages</em> where each page has 0 or more items. ")
public class SearchPagedCollection {
    @SerializedName("autoCorrections")
    private AutoCorrections autoCorrections = null;

    @SerializedName("href")
    private String href = null;

    @SerializedName("itemSummaries")
    private List<ItemSummary> itemSummaries = null;

    @SerializedName("limit")
    private Integer limit = null;

    @SerializedName("next")
    private String next = null;

    @SerializedName("offset")
    private Integer offset = null;

    @SerializedName("prev")
    private String prev = null;

    @SerializedName("refinement")
    private Refinement refinement = null;

    @SerializedName("total")
    private Integer total = null;

    @SerializedName("warnings")
    private List<Error> warnings = null;

    public SearchPagedCollection autoCorrections(AutoCorrections autoCorrections) {
        this.autoCorrections = autoCorrections;
        return this;
    }

    /**
     * Get autoCorrections
     *
     * @return autoCorrections
     **/
    @Schema(description = "")
    public AutoCorrections getAutoCorrections() {
        return autoCorrections;
    }

    public SearchPagedCollection href(String href) {
        this.href = href;
        return this;
    }

    /**
     * The URI of the current page of results. <br><br>The following example of the <b> search</b>
     * method returns items 1 thru 5 from the list of items found.
     * <br><br><code>https://api.ebay.com/buy/v1/item_summary/search?q=shirt&limit=5&offset=0</code>.
     *
     * @return href
     **/
    @Schema(description = "The URI of the current page of results. <br><br>The following example " +
            "of the <b> search</b> method returns items 1 thru 5 from the list of items found. " +
            "<br><br><code>https://api.ebay.com/buy/v1/item_summary/search?q=shirt&limit=5&offset=0</code>.")
    public String getHref() {
        return href;
    }

    public SearchPagedCollection itemSummaries(List<ItemSummary> itemSummaries) {
        this.itemSummaries = itemSummaries;
        return this;
    }

    public SearchPagedCollection addItemSummariesItem(ItemSummary itemSummariesItem) {
        if (this.itemSummaries == null) {
            this.itemSummaries = new ArrayList<>();
        }
        this.itemSummaries.add(itemSummariesItem);
        return this;
    }

    /**
     * An array of the items on this page. The items are sorted according to the sorting method
     * specified in the request.
     *
     * @return itemSummaries
     **/
    @Schema(description = "An array of the items on this page. The items are sorted according to " +
            "the sorting method specified in the request.")
    public List<ItemSummary> getItemSummaries() {
        return itemSummaries;
    }

    public SearchPagedCollection limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * The value of the <b>limit</b> parameter submitted in the request, which is the maximum
     * number of items to return on a page, from the result set. A result set is the complete
     * set of items returned by the method.
     *
     * @return limit
     **/
    @Schema(description = "The value of the <b>limit</b> parameter submitted in the request, which is " +
            "the maximum number of items to return on a page, from the result set. A result set is " +
            "the complete set of items returned by the method.")
    public Integer getLimit() {
        return limit;
    }

    public SearchPagedCollection next(String next) {
        this.next = next;
        return this;
    }

    /**
     * The URI for the next page of results. This value is returned if there is an additional page
     * of results to return from the result set. <br><br>The following example of the <b> search</b>
     * method returns items 5 thru 10 from the list of items found.
     * <br> <br><code>https://api.ebay.com/buy/v1/item_summary/search?query=t-shirts&limit=5&offset=10 </code>
     *
     * @return next
     **/
    @Schema(description = "The URI for the next page of results. This value is returned if there is " +
            "an additional page of results to return from the result set. " +
            "<br><br>The following example of the <b> search</b> method returns items 5 thru 10 from " +
            "the list of items found." +
            "<br> <br><code>https://api.ebay.com/buy/v1/item_summary/search?query=t-shirts&limit=5&offset=10 </code>")
    public String getNext() {
        return next;
    }

    public SearchPagedCollection offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * This value indicates the <b>offset</b> used for current page of items being returned.
     * Assume the initial request used an <b>offset</b> of <code>0</code> and a <b>limit</b> of
     * <code>3</code>. Then in the first page of results, this value would be <code>0</code>,
     * and items 1-3 are returned. For the second page, this value is <code>3</code> and so on.
     *
     * @return offset
     **/
    @Schema(description = "This value indicates the <b>offset</b> used for current page of items being " +
            "returned. Assume the initial request used an <b>offset</b> of <code>0</code> and a <b>limit</b> " +
            "of <code>3</code>. Then in the first page of results, this value would be <code>0</code>, " +
            "and items 1-3 are returned. For the second page, this value is <code>3</code> and so on.")
    public Integer getOffset() {
        return offset;
    }

    public SearchPagedCollection prev(String prev) {
        this.prev = prev;
        return this;
    }

    /**
     * The URI for the previous page of results. This is returned if there is a previous page
     * of results from the result set. <br><br>The following example of the <b> search</b>
     * method returns items 1 thru 5 from the list of items found, which would be the first
     * set of items returned.
     * <br> <br><code>https://api.ebay.com/buy/v1/item_summary/search?query=t-shirts&limit=5&offset=0</code>
     *
     * @return prev
     **/
    @Schema(description = "The URI for the previous page of results. This is returned if there is " +
            "a previous page of results from the result set. <br><br>The following example of the " +
            "<b> search</b> method returns items 1 thru 5 from the list of items found, which would " +
            "be the first set of items returned." +
            "<br> <br><code>https://api.ebay.com/buy/v1/item_summary/search?query=t-shirts&limit=5&offset=0</code>")
    public String getPrev() {
        return prev;
    }

    public SearchPagedCollection refinement(Refinement refinement) {
        this.refinement = refinement;
        return this;
    }

    /**
     * Get refinement
     *
     * @return refinement
     **/
    @Schema(description = "")
    public Refinement getRefinement() {
        return refinement;
    }

    public SearchPagedCollection total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * The total number of items that match the input criteria.
     * <br><br><span class="tablenote"><b>Note:</b> <code>total</code> is just an indicator of
     * the number of listings for a given query. It could vary based on the number of listings
     * with variations included in the result. It is strongly recommended that <code>total</code>
     * not be used in pagination use cases. Instead, use
     * <a href="/api-docs/buy/browse/resources/item_summary/methods/search#response.next "> next</a>
     * to determine the results on the next page.</span>
     *
     * @return total
     **/
    @Schema(description = "The total number of items that match the input criteria." +
            "<br><br><span class=\"tablenote\"><b>Note:</b> <code>total</code> is just an indicator " +
            "of the number of listings for a given query. It could vary based on the number of listings " +
            "with variations included in the result. It is strongly recommended that <code>total</code> " +
            "not be used in pagination use cases. Instead, use " +
            "<a href=\"/api-docs/buy/browse/resources/item_summary/methods/search#response.next \"> next</a> " +
            "to determine the results on the next page.</span>")
    public Integer getTotal() {
        return total;
    }

    public SearchPagedCollection warnings(List<Error> warnings) {
        this.warnings = warnings;
        return this;
    }

    public SearchPagedCollection addWarningsItem(Error warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * The container with all the warnings for the request.
     *
     * @return warnings
     **/
    @Schema(description = "The container with all the warnings for the request.")
    public List<Error> getWarnings() {
        return warnings;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchPagedCollection searchPagedCollection = (SearchPagedCollection) o;
        return Objects.equals(this.autoCorrections, searchPagedCollection.autoCorrections) &&
                Objects.equals(this.href, searchPagedCollection.href) &&
                Objects.equals(this.itemSummaries, searchPagedCollection.itemSummaries) &&
                Objects.equals(this.limit, searchPagedCollection.limit) &&
                Objects.equals(this.next, searchPagedCollection.next) &&
                Objects.equals(this.offset, searchPagedCollection.offset) &&
                Objects.equals(this.prev, searchPagedCollection.prev) &&
                Objects.equals(this.refinement, searchPagedCollection.refinement) &&
                Objects.equals(this.total, searchPagedCollection.total) &&
                Objects.equals(this.warnings, searchPagedCollection.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoCorrections, href, itemSummaries, limit, next, offset, prev, refinement, total, warnings);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchPagedCollection {\n");
        sb.append("    autoCorrections: ").append(toIndentedString(autoCorrections)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    itemSummaries: ").append(toIndentedString(itemSummaries)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    next: ").append(toIndentedString(next)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
        sb.append("    refinement: ").append(toIndentedString(refinement)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

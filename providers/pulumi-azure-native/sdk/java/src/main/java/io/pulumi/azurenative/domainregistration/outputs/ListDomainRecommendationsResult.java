// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.outputs;

import io.pulumi.azurenative.domainregistration.outputs.NameIdentifierResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListDomainRecommendationsResult {
    /**
     * Link to next page of resources.
     * 
     */
    private final String nextLink;
    /**
     * Collection of resources.
     * 
     */
    private final List<NameIdentifierResponse> value;

    @CustomType.Constructor
    private ListDomainRecommendationsResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<NameIdentifierResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to next page of resources.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * Collection of resources.
     * 
    */
    public List<NameIdentifierResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDomainRecommendationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<NameIdentifierResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDomainRecommendationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder value(List<NameIdentifierResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListDomainRecommendationsResult build() {
            return new ListDomainRecommendationsResult(nextLink, value);
        }
    }
}

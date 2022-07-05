// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TagsResponse {
    /**
     * @return Specifies a fingerprint for this request, which is essentially a hash of the tags&#39; contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    private final String fingerprint;
    /**
     * @return An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    private final List<String> items;

    @CustomType.Constructor
    private TagsResponse(
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("items") List<String> items) {
        this.fingerprint = fingerprint;
        this.items = items;
    }

    /**
     * @return Specifies a fingerprint for this request, which is essentially a hash of the tags&#39; contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update tags. You must always provide an up-to-date fingerprint hash in order to update or change tags. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return An array of tags. Each tag must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    public List<String> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fingerprint;
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(TagsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerprint = defaults.fingerprint;
    	      this.items = defaults.items;
        }

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public TagsResponse build() {
            return new TagsResponse(fingerprint, items);
        }
    }
}

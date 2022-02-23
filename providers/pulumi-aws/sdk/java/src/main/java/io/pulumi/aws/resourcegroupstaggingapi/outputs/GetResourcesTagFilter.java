// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourcesTagFilter {
    /**
     * One part of a key-value pair that makes up a tag.
     * 
     */
    private final String key;
    /**
     * The optional part of a key-value pair that make up a tag.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"key","values"})
    private GetResourcesTagFilter(
        String key,
        @Nullable List<String> values) {
        this.key = Objects.requireNonNull(key);
        this.values = values;
    }

    /**
     * One part of a key-value pair that makes up a tag.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * The optional part of a key-value pair that make up a tag.
     * 
     */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public GetResourcesTagFilter build() {
            return new GetResourcesTagFilter(key, values);
        }
    }
}

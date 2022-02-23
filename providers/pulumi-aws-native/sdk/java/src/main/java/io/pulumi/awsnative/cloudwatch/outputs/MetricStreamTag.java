// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricStreamTag {
    /**
     * A unique identifier for the tag.
     * 
     */
    private final String key;
    /**
     * An optional string, which you can use to describe or define the tag.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"key","value"})
    private MetricStreamTag(
        String key,
        @Nullable String value) {
        this.key = Objects.requireNonNull(key);
        this.value = value;
    }

    /**
     * A unique identifier for the tag.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * An optional string, which you can use to describe or define the tag.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public MetricStreamTag build() {
            return new MetricStreamTag(key, value);
        }
    }
}

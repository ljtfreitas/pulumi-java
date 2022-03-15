// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TemplateTag {
    /**
     * <p>Tag key.</p>
     * 
     */
    private final String key;
    /**
     * <p>Tag value.</p>
     * 
     */
    private final String value;

    @CustomType.Constructor
    private TemplateTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * <p>Tag key.</p>
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * <p>Tag value.</p>
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TemplateTag build() {
            return new TemplateTag(key, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * <p>The key or keys of the key-value pairs for the resource tag or tags assigned to the
 *             resource.</p>
 * 
 */
public final class AnalysisTag extends io.pulumi.resources.InvokeArgs {

    public static final AnalysisTag Empty = new AnalysisTag();

    /**
     * <p>Tag key.</p>
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * <p>Tag value.</p>
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public AnalysisTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AnalysisTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisTag defaults) {
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
        public AnalysisTag build() {
            return new AnalysisTag(key, value);
        }
    }
}

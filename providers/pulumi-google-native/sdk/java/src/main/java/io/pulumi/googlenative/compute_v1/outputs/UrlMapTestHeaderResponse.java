// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlMapTestHeaderResponse {
    /**
     * Header name.
     * 
     */
    private final String name;
    /**
     * Header value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private UrlMapTestHeaderResponse(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Header name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Header value.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public UrlMapTestHeaderResponse build() {
            return new UrlMapTestHeaderResponse(name, value);
        }
    }
}

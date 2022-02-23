// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A label for tagging Environment resource
 * 
 */
public final class ServiceTag extends io.pulumi.resources.InvokeArgs {

    public static final ServiceTag Empty = new ServiceTag();

    /**
     * A string used to identify this tag
     * 
     */
    @InputImport(name="key", required=true)
        private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public ServiceTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ServiceTag build() {
            return new ServiceTag(key, value);
        }
    }
}

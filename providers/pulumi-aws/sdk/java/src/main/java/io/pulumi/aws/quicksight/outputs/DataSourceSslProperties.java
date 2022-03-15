// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class DataSourceSslProperties {
    /**
     * A Boolean option to control whether SSL should be disabled.
     * 
     */
    private final Boolean disableSsl;

    @CustomType.Constructor
    private DataSourceSslProperties(@CustomType.Parameter("disableSsl") Boolean disableSsl) {
        this.disableSsl = disableSsl;
    }

    /**
     * A Boolean option to control whether SSL should be disabled.
     * 
    */
    public Boolean getDisableSsl() {
        return this.disableSsl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSslProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSslProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableSsl = defaults.disableSsl;
        }

        public Builder disableSsl(Boolean disableSsl) {
            this.disableSsl = Objects.requireNonNull(disableSsl);
            return this;
        }
        public DataSourceSslProperties build() {
            return new DataSourceSslProperties(disableSsl);
        }
    }
}

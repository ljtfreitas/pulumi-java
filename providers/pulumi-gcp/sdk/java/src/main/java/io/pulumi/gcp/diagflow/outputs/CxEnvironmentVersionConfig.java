// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CxEnvironmentVersionConfig {
    /**
     * Format: projects/{{project}}/locations/{{location}}/agents/{{agent}}/flows/{{flow}}/versions/{{version}}.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private CxEnvironmentVersionConfig(@CustomType.Parameter("version") String version) {
        this.version = version;
    }

    /**
     * Format: projects/{{project}}/locations/{{location}}/agents/{{agent}}/flows/{{flow}}/versions/{{version}}.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEnvironmentVersionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEnvironmentVersionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public CxEnvironmentVersionConfig build() {
            return new CxEnvironmentVersionConfig(version);
        }
    }
}

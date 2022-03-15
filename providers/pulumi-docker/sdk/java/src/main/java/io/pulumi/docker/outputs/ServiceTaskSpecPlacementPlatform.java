// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceTaskSpecPlacementPlatform {
    private final String architecture;
    private final String os;

    @CustomType.Constructor
    private ServiceTaskSpecPlacementPlatform(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("os") String os) {
        this.architecture = architecture;
        this.os = os;
    }

    public String getArchitecture() {
        return this.architecture;
    }
    public String getOs() {
        return this.os;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecPlacementPlatform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String os;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecPlacementPlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.os = defaults.os;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder os(String os) {
            this.os = Objects.requireNonNull(os);
            return this;
        }
        public ServiceTaskSpecPlacementPlatform build() {
            return new ServiceTaskSpecPlacementPlatform(architecture, os);
        }
    }
}

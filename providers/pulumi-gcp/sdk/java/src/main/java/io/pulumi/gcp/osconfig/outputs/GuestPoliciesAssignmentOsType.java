// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesAssignmentOsType {
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    private final @Nullable String osArchitecture;
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    private final @Nullable String osShortName;
    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    private final @Nullable String osVersion;

    @OutputCustomType.Constructor({"osArchitecture","osShortName","osVersion"})
    private GuestPoliciesAssignmentOsType(
        @Nullable String osArchitecture,
        @Nullable String osShortName,
        @Nullable String osVersion) {
        this.osArchitecture = osArchitecture;
        this.osShortName = osShortName;
        this.osVersion = osVersion;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    public Optional<String> getOsArchitecture() {
        return Optional.ofNullable(this.osArchitecture);
    }
    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    public Optional<String> getOsShortName() {
        return Optional.ofNullable(this.osShortName);
    }
    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentOsType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String osArchitecture;
        private @Nullable String osShortName;
        private @Nullable String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentOsType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsArchitecture(@Nullable String osArchitecture) {
            this.osArchitecture = osArchitecture;
            return this;
        }

        public Builder setOsShortName(@Nullable String osShortName) {
            this.osShortName = osShortName;
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public GuestPoliciesAssignmentOsType build() {
            return new GuestPoliciesAssignmentOsType(osArchitecture, osShortName, osVersion);
        }
    }
}

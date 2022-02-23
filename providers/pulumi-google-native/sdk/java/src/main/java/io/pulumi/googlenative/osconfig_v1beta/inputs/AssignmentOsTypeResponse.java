// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the criteria for selecting VM Instances by OS type.
 * 
 */
public final class AssignmentOsTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignmentOsTypeResponse Empty = new AssignmentOsTypeResponse();

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS architecture.
     * 
     */
    @InputImport(name="osArchitecture", required=true)
      private final String osArchitecture;

    public String getOsArchitecture() {
        return this.osArchitecture;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following OS short name, for example "debian" or "windows".
     * 
     */
    @InputImport(name="osShortName", required=true)
      private final String osShortName;

    public String getOsShortName() {
        return this.osShortName;
    }

    /**
     * Targets VM instances with OS Inventory enabled and having the following following OS version.
     * 
     */
    @InputImport(name="osVersion", required=true)
      private final String osVersion;

    public String getOsVersion() {
        return this.osVersion;
    }

    public AssignmentOsTypeResponse(
        String osArchitecture,
        String osShortName,
        String osVersion) {
        this.osArchitecture = Objects.requireNonNull(osArchitecture, "expected parameter 'osArchitecture' to be non-null");
        this.osShortName = Objects.requireNonNull(osShortName, "expected parameter 'osShortName' to be non-null");
        this.osVersion = Objects.requireNonNull(osVersion, "expected parameter 'osVersion' to be non-null");
    }

    private AssignmentOsTypeResponse() {
        this.osArchitecture = null;
        this.osShortName = null;
        this.osVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentOsTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osArchitecture;
        private String osShortName;
        private String osVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentOsTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osArchitecture = defaults.osArchitecture;
    	      this.osShortName = defaults.osShortName;
    	      this.osVersion = defaults.osVersion;
        }

        public Builder setOsArchitecture(String osArchitecture) {
            this.osArchitecture = Objects.requireNonNull(osArchitecture);
            return this;
        }

        public Builder setOsShortName(String osShortName) {
            this.osShortName = Objects.requireNonNull(osShortName);
            return this;
        }

        public Builder setOsVersion(String osVersion) {
            this.osVersion = Objects.requireNonNull(osVersion);
            return this;
        }
        public AssignmentOsTypeResponse build() {
            return new AssignmentOsTypeResponse(osArchitecture, osShortName, osVersion);
        }
    }
}

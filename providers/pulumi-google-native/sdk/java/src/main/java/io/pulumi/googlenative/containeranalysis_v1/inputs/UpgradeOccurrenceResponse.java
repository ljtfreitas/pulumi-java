// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An Upgrade Occurrence represents that a specific resource_url could install a specific upgrade. This presence is supplied via local sources (i.e. it is present in the mirror and the running system has noticed its availability). For Windows, both distribution and windows_update contain information for the Windows update.
 * 
 */
public final class UpgradeOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradeOccurrenceResponse Empty = new UpgradeOccurrenceResponse();

    /**
     * Metadata about the upgrade for available for the specific operating system for the resource_url. This allows efficient filtering, as well as making it easier to use the occurrence.
     * 
     */
    @Import(name="distribution", required=true)
      private final UpgradeDistributionResponse distribution;

    public UpgradeDistributionResponse getDistribution() {
        return this.distribution;
    }

    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    @Import(name="package", required=true)
      private final String $package;

    public String get$package() {
        return this.$package;
    }

    /**
     * Required for non-Windows OS. The version of the package in a machine + human readable form.
     * 
     */
    @Import(name="parsedVersion", required=true)
      private final VersionResponse parsedVersion;

    public VersionResponse getParsedVersion() {
        return this.parsedVersion;
    }

    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    @Import(name="windowsUpdate", required=true)
      private final WindowsUpdateResponse windowsUpdate;

    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    public UpgradeOccurrenceResponse(
        UpgradeDistributionResponse distribution,
        String $package,
        VersionResponse parsedVersion,
        WindowsUpdateResponse windowsUpdate) {
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.$package = Objects.requireNonNull($package, "expected parameter '$package' to be non-null");
        this.parsedVersion = Objects.requireNonNull(parsedVersion, "expected parameter 'parsedVersion' to be non-null");
        this.windowsUpdate = Objects.requireNonNull(windowsUpdate, "expected parameter 'windowsUpdate' to be non-null");
    }

    private UpgradeOccurrenceResponse() {
        this.distribution = null;
        this.$package = null;
        this.parsedVersion = null;
        this.windowsUpdate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDistributionResponse distribution;
        private String $package;
        private VersionResponse parsedVersion;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distribution = defaults.distribution;
    	      this.$package = defaults.$package;
    	      this.parsedVersion = defaults.parsedVersion;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder distribution(UpgradeDistributionResponse distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder $package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder parsedVersion(VersionResponse parsedVersion) {
            this.parsedVersion = Objects.requireNonNull(parsedVersion);
            return this;
        }

        public Builder windowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }
        public UpgradeOccurrenceResponse build() {
            return new UpgradeOccurrenceResponse(distribution, $package, parsedVersion, windowsUpdate);
        }
    }
}

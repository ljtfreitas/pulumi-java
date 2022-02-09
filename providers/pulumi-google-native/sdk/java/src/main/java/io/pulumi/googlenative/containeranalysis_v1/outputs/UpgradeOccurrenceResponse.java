// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UpgradeOccurrenceResponse {
    private final UpgradeDistributionResponse distribution;
    private final String $package;
    private final VersionResponse parsedVersion;
    private final WindowsUpdateResponse windowsUpdate;

    @OutputCustomType.Constructor({"distribution","$package","parsedVersion","windowsUpdate"})
    private UpgradeOccurrenceResponse(
        UpgradeDistributionResponse distribution,
        String $package,
        VersionResponse parsedVersion,
        WindowsUpdateResponse windowsUpdate) {
        this.distribution = Objects.requireNonNull(distribution);
        this.$package = Objects.requireNonNull($package);
        this.parsedVersion = Objects.requireNonNull(parsedVersion);
        this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
    }

    public UpgradeDistributionResponse getDistribution() {
        return this.distribution;
    }
    public String get$package() {
        return this.$package;
    }
    public VersionResponse getParsedVersion() {
        return this.parsedVersion;
    }
    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
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

        public Builder setDistribution(UpgradeDistributionResponse distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setParsedVersion(VersionResponse parsedVersion) {
            this.parsedVersion = Objects.requireNonNull(parsedVersion);
            return this;
        }

        public Builder setWindowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }

        public UpgradeOccurrenceResponse build() {
            return new UpgradeOccurrenceResponse(distribution, $package, parsedVersion, windowsUpdate);
        }
    }
}
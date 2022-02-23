// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VulnerabilityLocationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message wraps a location affected by a vulnerability and its associated fix (if one is available).
 * 
 */
public final class PackageIssueArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageIssueArgs Empty = new PackageIssueArgs();

    /**
     * The location of the vulnerability.
     * 
     */
    @InputImport(name="affectedLocation")
      private final @Nullable Input<VulnerabilityLocationArgs> affectedLocation;

    public Input<VulnerabilityLocationArgs> getAffectedLocation() {
        return this.affectedLocation == null ? Input.empty() : this.affectedLocation;
    }

    /**
     * The location of the available fix for vulnerability.
     * 
     */
    @InputImport(name="fixedLocation")
      private final @Nullable Input<VulnerabilityLocationArgs> fixedLocation;

    public Input<VulnerabilityLocationArgs> getFixedLocation() {
        return this.fixedLocation == null ? Input.empty() : this.fixedLocation;
    }

    /**
     * The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    @InputImport(name="packageType")
      private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    @InputImport(name="severityName")
      private final @Nullable Input<String> severityName;

    public Input<String> getSeverityName() {
        return this.severityName == null ? Input.empty() : this.severityName;
    }

    public PackageIssueArgs(
        @Nullable Input<VulnerabilityLocationArgs> affectedLocation,
        @Nullable Input<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Input<String> packageType,
        @Nullable Input<String> severityName) {
        this.affectedLocation = affectedLocation;
        this.fixedLocation = fixedLocation;
        this.packageType = packageType;
        this.severityName = severityName;
    }

    private PackageIssueArgs() {
        this.affectedLocation = Input.empty();
        this.fixedLocation = Input.empty();
        this.packageType = Input.empty();
        this.severityName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VulnerabilityLocationArgs> affectedLocation;
        private @Nullable Input<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Input<String> packageType;
        private @Nullable Input<String> severityName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
        }

        public Builder setAffectedLocation(@Nullable Input<VulnerabilityLocationArgs> affectedLocation) {
            this.affectedLocation = affectedLocation;
            return this;
        }

        public Builder setAffectedLocation(@Nullable VulnerabilityLocationArgs affectedLocation) {
            this.affectedLocation = Input.ofNullable(affectedLocation);
            return this;
        }

        public Builder setFixedLocation(@Nullable Input<VulnerabilityLocationArgs> fixedLocation) {
            this.fixedLocation = fixedLocation;
            return this;
        }

        public Builder setFixedLocation(@Nullable VulnerabilityLocationArgs fixedLocation) {
            this.fixedLocation = Input.ofNullable(fixedLocation);
            return this;
        }

        public Builder setPackageType(@Nullable Input<String> packageType) {
            this.packageType = packageType;
            return this;
        }

        public Builder setPackageType(@Nullable String packageType) {
            this.packageType = Input.ofNullable(packageType);
            return this;
        }

        public Builder setSeverityName(@Nullable Input<String> severityName) {
            this.severityName = severityName;
            return this;
        }

        public Builder setSeverityName(@Nullable String severityName) {
            this.severityName = Input.ofNullable(severityName);
            return this;
        }
        public PackageIssueArgs build() {
            return new PackageIssueArgs(affectedLocation, fixedLocation, packageType, severityName);
        }
    }
}

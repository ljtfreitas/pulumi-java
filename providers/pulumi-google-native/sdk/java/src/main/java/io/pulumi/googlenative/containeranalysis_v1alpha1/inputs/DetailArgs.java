// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VersionArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.VulnerabilityLocationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifies all occurrences of this vulnerability in the package for a specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8 for versions 2.1 - 2.2
 * 
 */
public final class DetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetailArgs Empty = new DetailArgs();

    /**
     * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="cpeUri")
      private final @Nullable Input<String> cpeUri;

    public Input<String> getCpeUri() {
        return this.cpeUri == null ? Input.empty() : this.cpeUri;
    }

    /**
     * A vendor-specific description of this note.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The fix for this specific package version.
     * 
     */
    @InputImport(name="fixedLocation")
      private final @Nullable Input<VulnerabilityLocationArgs> fixedLocation;

    public Input<VulnerabilityLocationArgs> getFixedLocation() {
        return this.fixedLocation == null ? Input.empty() : this.fixedLocation;
    }

    /**
     * Whether this Detail is obsolete. Occurrences are expected not to point to obsolete details.
     * 
     */
    @InputImport(name="isObsolete")
      private final @Nullable Input<Boolean> isObsolete;

    public Input<Boolean> getIsObsolete() {
        return this.isObsolete == null ? Input.empty() : this.isObsolete;
    }

    /**
     * The max version of the package in which the vulnerability exists.
     * 
     */
    @InputImport(name="maxAffectedVersion")
      private final @Nullable Input<VersionArgs> maxAffectedVersion;

    public Input<VersionArgs> getMaxAffectedVersion() {
        return this.maxAffectedVersion == null ? Input.empty() : this.maxAffectedVersion;
    }

    /**
     * The min version of the package in which the vulnerability exists.
     * 
     */
    @InputImport(name="minAffectedVersion")
      private final @Nullable Input<VersionArgs> minAffectedVersion;

    public Input<VersionArgs> getMinAffectedVersion() {
        return this.minAffectedVersion == null ? Input.empty() : this.minAffectedVersion;
    }

    /**
     * The name of the package where the vulnerability was found. This field can be used as a filter in list requests.
     * 
     */
    @InputImport(name="package")
      private final @Nullable Input<String> $package;

    public Input<String> get$package() {
        return this.$package == null ? Input.empty() : this.$package;
    }

    /**
     * The type of package; whether native or non native(ruby gems, node.js packages etc)
     * 
     */
    @InputImport(name="packageType")
      private final @Nullable Input<String> packageType;

    public Input<String> getPackageType() {
        return this.packageType == null ? Input.empty() : this.packageType;
    }

    /**
     * The severity (eg: distro assigned severity) for this vulnerability.
     * 
     */
    @InputImport(name="severityName")
      private final @Nullable Input<String> severityName;

    public Input<String> getSeverityName() {
        return this.severityName == null ? Input.empty() : this.severityName;
    }

    /**
     * The source from which the information in this Detail was obtained.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The vendor of the product. e.g. "google"
     * 
     */
    @InputImport(name="vendor")
      private final @Nullable Input<String> vendor;

    public Input<String> getVendor() {
        return this.vendor == null ? Input.empty() : this.vendor;
    }

    public DetailArgs(
        @Nullable Input<String> cpeUri,
        @Nullable Input<String> description,
        @Nullable Input<VulnerabilityLocationArgs> fixedLocation,
        @Nullable Input<Boolean> isObsolete,
        @Nullable Input<VersionArgs> maxAffectedVersion,
        @Nullable Input<VersionArgs> minAffectedVersion,
        @Nullable Input<String> $package,
        @Nullable Input<String> packageType,
        @Nullable Input<String> severityName,
        @Nullable Input<String> source,
        @Nullable Input<String> vendor) {
        this.cpeUri = cpeUri;
        this.description = description;
        this.fixedLocation = fixedLocation;
        this.isObsolete = isObsolete;
        this.maxAffectedVersion = maxAffectedVersion;
        this.minAffectedVersion = minAffectedVersion;
        this.$package = $package;
        this.packageType = packageType;
        this.severityName = severityName;
        this.source = source;
        this.vendor = vendor;
    }

    private DetailArgs() {
        this.cpeUri = Input.empty();
        this.description = Input.empty();
        this.fixedLocation = Input.empty();
        this.isObsolete = Input.empty();
        this.maxAffectedVersion = Input.empty();
        this.minAffectedVersion = Input.empty();
        this.$package = Input.empty();
        this.packageType = Input.empty();
        this.severityName = Input.empty();
        this.source = Input.empty();
        this.vendor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cpeUri;
        private @Nullable Input<String> description;
        private @Nullable Input<VulnerabilityLocationArgs> fixedLocation;
        private @Nullable Input<Boolean> isObsolete;
        private @Nullable Input<VersionArgs> maxAffectedVersion;
        private @Nullable Input<VersionArgs> minAffectedVersion;
        private @Nullable Input<String> $package;
        private @Nullable Input<String> packageType;
        private @Nullable Input<String> severityName;
        private @Nullable Input<String> source;
        private @Nullable Input<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(DetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.isObsolete = defaults.isObsolete;
    	      this.maxAffectedVersion = defaults.maxAffectedVersion;
    	      this.minAffectedVersion = defaults.minAffectedVersion;
    	      this.$package = defaults.$package;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
    	      this.source = defaults.source;
    	      this.vendor = defaults.vendor;
        }

        public Builder setCpeUri(@Nullable Input<String> cpeUri) {
            this.cpeUri = cpeUri;
            return this;
        }

        public Builder setCpeUri(@Nullable String cpeUri) {
            this.cpeUri = Input.ofNullable(cpeUri);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setIsObsolete(@Nullable Input<Boolean> isObsolete) {
            this.isObsolete = isObsolete;
            return this;
        }

        public Builder setIsObsolete(@Nullable Boolean isObsolete) {
            this.isObsolete = Input.ofNullable(isObsolete);
            return this;
        }

        public Builder setMaxAffectedVersion(@Nullable Input<VersionArgs> maxAffectedVersion) {
            this.maxAffectedVersion = maxAffectedVersion;
            return this;
        }

        public Builder setMaxAffectedVersion(@Nullable VersionArgs maxAffectedVersion) {
            this.maxAffectedVersion = Input.ofNullable(maxAffectedVersion);
            return this;
        }

        public Builder setMinAffectedVersion(@Nullable Input<VersionArgs> minAffectedVersion) {
            this.minAffectedVersion = minAffectedVersion;
            return this;
        }

        public Builder setMinAffectedVersion(@Nullable VersionArgs minAffectedVersion) {
            this.minAffectedVersion = Input.ofNullable(minAffectedVersion);
            return this;
        }

        public Builder set$package(@Nullable Input<String> $package) {
            this.$package = $package;
            return this;
        }

        public Builder set$package(@Nullable String $package) {
            this.$package = Input.ofNullable($package);
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

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setVendor(@Nullable Input<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = Input.ofNullable(vendor);
            return this;
        }
        public DetailArgs build() {
            return new DetailArgs(cpeUri, description, fixedLocation, isObsolete, maxAffectedVersion, minAffectedVersion, $package, packageType, severityName, source, vendor);
        }
    }
}

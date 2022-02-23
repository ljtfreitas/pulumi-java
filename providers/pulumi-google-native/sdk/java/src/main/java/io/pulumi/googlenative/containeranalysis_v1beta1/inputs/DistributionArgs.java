// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.DistributionArchitecture;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This represents a particular channel of distribution for a given package. E.g., Debian's jessie-backports dpkg mirror.
 * 
 */
public final class DistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionArgs Empty = new DistributionArgs();

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    @InputImport(name="architecture")
      private final @Nullable Input<DistributionArchitecture> architecture;

    public Input<DistributionArchitecture> getArchitecture() {
        return this.architecture == null ? Input.empty() : this.architecture;
    }

    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @InputImport(name="cpeUri", required=true)
      private final Input<String> cpeUri;

    public Input<String> getCpeUri() {
        return this.cpeUri;
    }

    /**
     * The distribution channel-specific description of this package.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    @InputImport(name="latestVersion")
      private final @Nullable Input<VersionArgs> latestVersion;

    public Input<VersionArgs> getLatestVersion() {
        return this.latestVersion == null ? Input.empty() : this.latestVersion;
    }

    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    @InputImport(name="maintainer")
      private final @Nullable Input<String> maintainer;

    public Input<String> getMaintainer() {
        return this.maintainer == null ? Input.empty() : this.maintainer;
    }

    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public DistributionArgs(
        @Nullable Input<DistributionArchitecture> architecture,
        Input<String> cpeUri,
        @Nullable Input<String> description,
        @Nullable Input<VersionArgs> latestVersion,
        @Nullable Input<String> maintainer,
        @Nullable Input<String> url) {
        this.architecture = architecture;
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = description;
        this.latestVersion = latestVersion;
        this.maintainer = maintainer;
        this.url = url;
    }

    private DistributionArgs() {
        this.architecture = Input.empty();
        this.cpeUri = Input.empty();
        this.description = Input.empty();
        this.latestVersion = Input.empty();
        this.maintainer = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionArchitecture> architecture;
        private Input<String> cpeUri;
        private @Nullable Input<String> description;
        private @Nullable Input<VersionArgs> latestVersion;
        private @Nullable Input<String> maintainer;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.latestVersion = defaults.latestVersion;
    	      this.maintainer = defaults.maintainer;
    	      this.url = defaults.url;
        }

        public Builder setArchitecture(@Nullable Input<DistributionArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder setArchitecture(@Nullable DistributionArchitecture architecture) {
            this.architecture = Input.ofNullable(architecture);
            return this;
        }

        public Builder setCpeUri(Input<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }

        public Builder setCpeUri(String cpeUri) {
            this.cpeUri = Input.of(Objects.requireNonNull(cpeUri));
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

        public Builder setLatestVersion(@Nullable Input<VersionArgs> latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        public Builder setLatestVersion(@Nullable VersionArgs latestVersion) {
            this.latestVersion = Input.ofNullable(latestVersion);
            return this;
        }

        public Builder setMaintainer(@Nullable Input<String> maintainer) {
            this.maintainer = maintainer;
            return this;
        }

        public Builder setMaintainer(@Nullable String maintainer) {
            this.maintainer = Input.ofNullable(maintainer);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public DistributionArgs build() {
            return new DistributionArgs(architecture, cpeUri, description, latestVersion, maintainer, url);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.RCranPackageResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.RGitHubPackageResponseResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for a R environment.
 * 
 */
public final class ModelEnvironmentDefinitionResponseResponseR extends io.pulumi.resources.InvokeArgs {

    public static final ModelEnvironmentDefinitionResponseResponseR Empty = new ModelEnvironmentDefinitionResponseResponseR();

    /**
     * The packages from Bioconductor.
     * 
     */
    @InputImport(name="bioConductorPackages")
        private final @Nullable List<String> bioConductorPackages;

    public List<String> getBioConductorPackages() {
        return this.bioConductorPackages == null ? List.of() : this.bioConductorPackages;
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @InputImport(name="cranPackages")
        private final @Nullable List<RCranPackageResponse> cranPackages;

    public List<RCranPackageResponse> getCranPackages() {
        return this.cranPackages == null ? List.of() : this.cranPackages;
    }

    /**
     * The packages from custom urls.
     * 
     */
    @InputImport(name="customUrlPackages")
        private final @Nullable List<String> customUrlPackages;

    public List<String> getCustomUrlPackages() {
        return this.customUrlPackages == null ? List.of() : this.customUrlPackages;
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @InputImport(name="gitHubPackages")
        private final @Nullable List<RGitHubPackageResponseResponse> gitHubPackages;

    public List<RGitHubPackageResponseResponse> getGitHubPackages() {
        return this.gitHubPackages == null ? List.of() : this.gitHubPackages;
    }

    /**
     * The version of R to be installed
     * 
     */
    @InputImport(name="rVersion")
        private final @Nullable String rVersion;

    public Optional<String> getRVersion() {
        return this.rVersion == null ? Optional.empty() : Optional.ofNullable(this.rVersion);
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @InputImport(name="rscriptPath")
        private final @Nullable String rscriptPath;

    public Optional<String> getRscriptPath() {
        return this.rscriptPath == null ? Optional.empty() : Optional.ofNullable(this.rscriptPath);
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. "2019-04-17"
     * 
     */
    @InputImport(name="snapshotDate")
        private final @Nullable String snapshotDate;

    public Optional<String> getSnapshotDate() {
        return this.snapshotDate == null ? Optional.empty() : Optional.ofNullable(this.snapshotDate);
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @InputImport(name="userManaged")
        private final @Nullable Boolean userManaged;

    public Optional<Boolean> getUserManaged() {
        return this.userManaged == null ? Optional.empty() : Optional.ofNullable(this.userManaged);
    }

    public ModelEnvironmentDefinitionResponseResponseR(
        @Nullable List<String> bioConductorPackages,
        @Nullable List<RCranPackageResponse> cranPackages,
        @Nullable List<String> customUrlPackages,
        @Nullable List<RGitHubPackageResponseResponse> gitHubPackages,
        @Nullable String rVersion,
        @Nullable String rscriptPath,
        @Nullable String snapshotDate,
        @Nullable Boolean userManaged) {
        this.bioConductorPackages = bioConductorPackages;
        this.cranPackages = cranPackages;
        this.customUrlPackages = customUrlPackages;
        this.gitHubPackages = gitHubPackages;
        this.rVersion = rVersion;
        this.rscriptPath = rscriptPath;
        this.snapshotDate = snapshotDate;
        this.userManaged = userManaged;
    }

    private ModelEnvironmentDefinitionResponseResponseR() {
        this.bioConductorPackages = List.of();
        this.cranPackages = List.of();
        this.customUrlPackages = List.of();
        this.gitHubPackages = List.of();
        this.rVersion = null;
        this.rscriptPath = null;
        this.snapshotDate = null;
        this.userManaged = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> bioConductorPackages;
        private @Nullable List<RCranPackageResponse> cranPackages;
        private @Nullable List<String> customUrlPackages;
        private @Nullable List<RGitHubPackageResponseResponse> gitHubPackages;
        private @Nullable String rVersion;
        private @Nullable String rscriptPath;
        private @Nullable String snapshotDate;
        private @Nullable Boolean userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bioConductorPackages = defaults.bioConductorPackages;
    	      this.cranPackages = defaults.cranPackages;
    	      this.customUrlPackages = defaults.customUrlPackages;
    	      this.gitHubPackages = defaults.gitHubPackages;
    	      this.rVersion = defaults.rVersion;
    	      this.rscriptPath = defaults.rscriptPath;
    	      this.snapshotDate = defaults.snapshotDate;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder setBioConductorPackages(@Nullable List<String> bioConductorPackages) {
            this.bioConductorPackages = bioConductorPackages;
            return this;
        }

        public Builder setCranPackages(@Nullable List<RCranPackageResponse> cranPackages) {
            this.cranPackages = cranPackages;
            return this;
        }

        public Builder setCustomUrlPackages(@Nullable List<String> customUrlPackages) {
            this.customUrlPackages = customUrlPackages;
            return this;
        }

        public Builder setGitHubPackages(@Nullable List<RGitHubPackageResponseResponse> gitHubPackages) {
            this.gitHubPackages = gitHubPackages;
            return this;
        }

        public Builder setRVersion(@Nullable String rVersion) {
            this.rVersion = rVersion;
            return this;
        }

        public Builder setRscriptPath(@Nullable String rscriptPath) {
            this.rscriptPath = rscriptPath;
            return this;
        }

        public Builder setSnapshotDate(@Nullable String snapshotDate) {
            this.snapshotDate = snapshotDate;
            return this;
        }

        public Builder setUserManaged(@Nullable Boolean userManaged) {
            this.userManaged = userManaged;
            return this;
        }
        public ModelEnvironmentDefinitionResponseResponseR build() {
            return new ModelEnvironmentDefinitionResponseResponseR(bioConductorPackages, cranPackages, customUrlPackages, gitHubPackages, rVersion, rscriptPath, snapshotDate, userManaged);
        }
    }
}

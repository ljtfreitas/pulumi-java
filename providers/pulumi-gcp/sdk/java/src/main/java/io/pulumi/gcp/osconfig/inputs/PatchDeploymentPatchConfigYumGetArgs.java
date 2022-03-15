// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigYumGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigYumGetArgs Empty = new PatchDeploymentPatchConfigYumGetArgs();

    /**
     * List of KBs to exclude from update.
     * 
     */
    @Import(name="excludes")
      private final @Nullable Output<List<String>> excludes;

    public Output<List<String>> getExcludes() {
        return this.excludes == null ? Output.empty() : this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated.
     * If these packages are not installed, they will be ignored. This field cannot be specified with
     * any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePackages")
      private final @Nullable Output<List<String>> exclusivePackages;

    public Output<List<String>> getExclusivePackages() {
        return this.exclusivePackages == null ? Output.empty() : this.exclusivePackages;
    }

    /**
     * Will cause patch to run yum update-minimal instead.
     * 
     */
    @Import(name="minimal")
      private final @Nullable Output<Boolean> minimal;

    public Output<Boolean> getMinimal() {
        return this.minimal == null ? Output.empty() : this.minimal;
    }

    /**
     * Adds the --security flag to yum update. Not supported on all platforms.
     * 
     */
    @Import(name="security")
      private final @Nullable Output<Boolean> security;

    public Output<Boolean> getSecurity() {
        return this.security == null ? Output.empty() : this.security;
    }

    public PatchDeploymentPatchConfigYumGetArgs(
        @Nullable Output<List<String>> excludes,
        @Nullable Output<List<String>> exclusivePackages,
        @Nullable Output<Boolean> minimal,
        @Nullable Output<Boolean> security) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.minimal = minimal;
        this.security = security;
    }

    private PatchDeploymentPatchConfigYumGetArgs() {
        this.excludes = Output.empty();
        this.exclusivePackages = Output.empty();
        this.minimal = Output.empty();
        this.security = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigYumGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> excludes;
        private @Nullable Output<List<String>> exclusivePackages;
        private @Nullable Output<Boolean> minimal;
        private @Nullable Output<Boolean> security;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigYumGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.minimal = defaults.minimal;
    	      this.security = defaults.security;
        }

        public Builder excludes(@Nullable Output<List<String>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = Output.ofNullable(excludes);
            return this;
        }

        public Builder exclusivePackages(@Nullable Output<List<String>> exclusivePackages) {
            this.exclusivePackages = exclusivePackages;
            return this;
        }

        public Builder exclusivePackages(@Nullable List<String> exclusivePackages) {
            this.exclusivePackages = Output.ofNullable(exclusivePackages);
            return this;
        }

        public Builder minimal(@Nullable Output<Boolean> minimal) {
            this.minimal = minimal;
            return this;
        }

        public Builder minimal(@Nullable Boolean minimal) {
            this.minimal = Output.ofNullable(minimal);
            return this;
        }

        public Builder security(@Nullable Output<Boolean> security) {
            this.security = security;
            return this;
        }

        public Builder security(@Nullable Boolean security) {
            this.security = Output.ofNullable(security);
            return this;
        }
        public PatchDeploymentPatchConfigYumGetArgs build() {
            return new PatchDeploymentPatchConfigYumGetArgs(excludes, exclusivePackages, minimal, security);
        }
    }
}

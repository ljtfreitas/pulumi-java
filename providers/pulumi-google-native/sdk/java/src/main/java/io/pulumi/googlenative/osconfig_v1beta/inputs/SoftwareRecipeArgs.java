// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1beta.enums.SoftwareRecipeDesiredState;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArtifactArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A software recipe is a set of instructions for installing and configuring a piece of software. It consists of a set of artifacts that are downloaded, and a set of steps that install, configure, and/or update the software. Recipes support installing and updating software from artifacts in the following formats: Zip archive, Tar archive, Windows MSI, Debian package, and RPM package. Additionally, recipes support executing a script (either defined in a file or directly in this api) in bash, sh, cmd, and powershell. Updating a software recipe If a recipe is assigned to an instance and there is a recipe with the same name but a lower version already installed and the assigned state of the recipe is `UPDATED`, then the recipe is updated to the new version. Script Working Directories Each script or execution step is run in its own temporary directory which is deleted after completing the step.
 * 
 */
public final class SoftwareRecipeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareRecipeArgs Empty = new SoftwareRecipeArgs();

    /**
     * Resources available to be used in the steps in the recipe.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts;

    public Output<List<SoftwareRecipeArtifactArgs>> getArtifacts() {
        return this.artifacts == null ? Output.empty() : this.artifacts;
    }

    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won't be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * 
     */
    @Import(name="desiredState")
      private final @Nullable Output<SoftwareRecipeDesiredState> desiredState;

    public Output<SoftwareRecipeDesiredState> getDesiredState() {
        return this.desiredState == null ? Output.empty() : this.desiredState;
    }

    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    @Import(name="installSteps")
      private final @Nullable Output<List<SoftwareRecipeStepArgs>> installSteps;

    public Output<List<SoftwareRecipeStepArgs>> getInstallSteps() {
        return this.installSteps == null ? Output.empty() : this.installSteps;
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
     * 
     */
    @Import(name="updateSteps")
      private final @Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps;

    public Output<List<SoftwareRecipeStepArgs>> getUpdateSteps() {
        return this.updateSteps == null ? Output.empty() : this.updateSteps;
    }

    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public SoftwareRecipeArgs(
        @Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts,
        @Nullable Output<SoftwareRecipeDesiredState> desiredState,
        @Nullable Output<List<SoftwareRecipeStepArgs>> installSteps,
        Output<String> name,
        @Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps,
        @Nullable Output<String> version) {
        this.artifacts = artifacts;
        this.desiredState = desiredState;
        this.installSteps = installSteps;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.updateSteps = updateSteps;
        this.version = version;
    }

    private SoftwareRecipeArgs() {
        this.artifacts = Output.empty();
        this.desiredState = Output.empty();
        this.installSteps = Output.empty();
        this.name = Output.empty();
        this.updateSteps = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts;
        private @Nullable Output<SoftwareRecipeDesiredState> desiredState;
        private @Nullable Output<List<SoftwareRecipeStepArgs>> installSteps;
        private Output<String> name;
        private @Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.desiredState = defaults.desiredState;
    	      this.installSteps = defaults.installSteps;
    	      this.name = defaults.name;
    	      this.updateSteps = defaults.updateSteps;
    	      this.version = defaults.version;
        }

        public Builder artifacts(@Nullable Output<List<SoftwareRecipeArtifactArgs>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(@Nullable List<SoftwareRecipeArtifactArgs> artifacts) {
            this.artifacts = Output.ofNullable(artifacts);
            return this;
        }

        public Builder desiredState(@Nullable Output<SoftwareRecipeDesiredState> desiredState) {
            this.desiredState = desiredState;
            return this;
        }

        public Builder desiredState(@Nullable SoftwareRecipeDesiredState desiredState) {
            this.desiredState = Output.ofNullable(desiredState);
            return this;
        }

        public Builder installSteps(@Nullable Output<List<SoftwareRecipeStepArgs>> installSteps) {
            this.installSteps = installSteps;
            return this;
        }

        public Builder installSteps(@Nullable List<SoftwareRecipeStepArgs> installSteps) {
            this.installSteps = Output.ofNullable(installSteps);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder updateSteps(@Nullable Output<List<SoftwareRecipeStepArgs>> updateSteps) {
            this.updateSteps = updateSteps;
            return this;
        }

        public Builder updateSteps(@Nullable List<SoftwareRecipeStepArgs> updateSteps) {
            this.updateSteps = Output.ofNullable(updateSteps);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public SoftwareRecipeArgs build() {
            return new SoftwareRecipeArgs(artifacts, desiredState, installSteps, name, updateSteps, version);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.notebooks.inputs.EnvironmentContainerImageGetArgs;
import io.pulumi.gcp.notebooks.inputs.EnvironmentVmImageGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
      private final @Nullable Output<EnvironmentContainerImageGetArgs> containerImage;

    public Output<EnvironmentContainerImageGetArgs> containerImage() {
        return this.containerImage == null ? Codegen.empty() : this.containerImage;
    }

    /**
     * Instance creation time
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * A brief description of this environment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Display name of this environment for the UI.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name specified for the Environment instance.
     * Format: projects/{project_id}/locations/{location}/environments/{environmentId}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up.
     * The path must be a URL or Cloud Storage path. Example: "gs://path-to-file/file-name"
     * 
     */
    @Import(name="postStartupScript")
      private final @Nullable Output<String> postStartupScript;

    public Output<String> postStartupScript() {
        return this.postStartupScript == null ? Codegen.empty() : this.postStartupScript;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
      private final @Nullable Output<EnvironmentVmImageGetArgs> vmImage;

    public Output<EnvironmentVmImageGetArgs> vmImage() {
        return this.vmImage == null ? Codegen.empty() : this.vmImage;
    }

    public EnvironmentState(
        @Nullable Output<EnvironmentContainerImageGetArgs> containerImage,
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> postStartupScript,
        @Nullable Output<String> project,
        @Nullable Output<EnvironmentVmImageGetArgs> vmImage) {
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.description = description;
        this.displayName = displayName;
        this.location = location;
        this.name = name;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.vmImage = vmImage;
    }

    private EnvironmentState() {
        this.containerImage = Codegen.empty();
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.postStartupScript = Codegen.empty();
        this.project = Codegen.empty();
        this.vmImage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EnvironmentContainerImageGetArgs> containerImage;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> postStartupScript;
        private @Nullable Output<String> project;
        private @Nullable Output<EnvironmentVmImageGetArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder containerImage(@Nullable Output<EnvironmentContainerImageGetArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder containerImage(@Nullable EnvironmentContainerImageGetArgs containerImage) {
            this.containerImage = Codegen.ofNullable(containerImage);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Codegen.ofNullable(postStartupScript);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder vmImage(@Nullable Output<EnvironmentVmImageGetArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public Builder vmImage(@Nullable EnvironmentVmImageGetArgs vmImage) {
            this.vmImage = Codegen.ofNullable(vmImage);
            return this;
        }        public EnvironmentState build() {
            return new EnvironmentState(containerImage, createTime, description, displayName, location, name, postStartupScript, project, vmImage);
        }
    }
}

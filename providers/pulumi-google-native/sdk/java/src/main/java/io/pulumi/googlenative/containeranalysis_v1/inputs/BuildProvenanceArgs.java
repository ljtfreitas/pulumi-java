// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.inputs.ArtifactArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.CommandArgs;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provenance of a build. Contains all information needed to verify the full details about the build from source to completion.
 * 
 */
public final class BuildProvenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildProvenanceArgs Empty = new BuildProvenanceArgs();

    /**
     * Special options applied to this build. This is a catch-all field where build providers can enter any desired additional details.
     * 
     */
    @Import(name="buildOptions")
      private final @Nullable Output<Map<String,String>> buildOptions;

    public Output<Map<String,String>> getBuildOptions() {
        return this.buildOptions == null ? Output.empty() : this.buildOptions;
    }

    /**
     * Version string of the builder at the time this build was executed.
     * 
     */
    @Import(name="builderVersion")
      private final @Nullable Output<String> builderVersion;

    public Output<String> getBuilderVersion() {
        return this.builderVersion == null ? Output.empty() : this.builderVersion;
    }

    /**
     * Output of the build.
     * 
     */
    @Import(name="builtArtifacts")
      private final @Nullable Output<List<ArtifactArgs>> builtArtifacts;

    public Output<List<ArtifactArgs>> getBuiltArtifacts() {
        return this.builtArtifacts == null ? Output.empty() : this.builtArtifacts;
    }

    /**
     * Commands requested by the build.
     * 
     */
    @Import(name="commands")
      private final @Nullable Output<List<CommandArgs>> commands;

    public Output<List<CommandArgs>> getCommands() {
        return this.commands == null ? Output.empty() : this.commands;
    }

    /**
     * Time at which the build was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the user's e-mail address at the time the build was initiated; this address may not represent the same end-user for all time.
     * 
     */
    @Import(name="creator")
      private final @Nullable Output<String> creator;

    public Output<String> getCreator() {
        return this.creator == null ? Output.empty() : this.creator;
    }

    /**
     * Time at which execution of the build was finished.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * Unique identifier of the build.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * URI where any logs for this provenance were written.
     * 
     */
    @Import(name="logsUri")
      private final @Nullable Output<String> logsUri;

    public Output<String> getLogsUri() {
        return this.logsUri == null ? Output.empty() : this.logsUri;
    }

    /**
     * ID of the project.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Details of the Source input to the build.
     * 
     */
    @Import(name="sourceProvenance")
      private final @Nullable Output<SourceArgs> sourceProvenance;

    public Output<SourceArgs> getSourceProvenance() {
        return this.sourceProvenance == null ? Output.empty() : this.sourceProvenance;
    }

    /**
     * Time at which execution of the build was started.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     * 
     */
    @Import(name="triggerId")
      private final @Nullable Output<String> triggerId;

    public Output<String> getTriggerId() {
        return this.triggerId == null ? Output.empty() : this.triggerId;
    }

    public BuildProvenanceArgs(
        @Nullable Output<Map<String,String>> buildOptions,
        @Nullable Output<String> builderVersion,
        @Nullable Output<List<ArtifactArgs>> builtArtifacts,
        @Nullable Output<List<CommandArgs>> commands,
        @Nullable Output<String> createTime,
        @Nullable Output<String> creator,
        @Nullable Output<String> endTime,
        Output<String> id,
        @Nullable Output<String> logsUri,
        @Nullable Output<String> project,
        @Nullable Output<SourceArgs> sourceProvenance,
        @Nullable Output<String> startTime,
        @Nullable Output<String> triggerId) {
        this.buildOptions = buildOptions;
        this.builderVersion = builderVersion;
        this.builtArtifacts = builtArtifacts;
        this.commands = commands;
        this.createTime = createTime;
        this.creator = creator;
        this.endTime = endTime;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.logsUri = logsUri;
        this.project = project;
        this.sourceProvenance = sourceProvenance;
        this.startTime = startTime;
        this.triggerId = triggerId;
    }

    private BuildProvenanceArgs() {
        this.buildOptions = Output.empty();
        this.builderVersion = Output.empty();
        this.builtArtifacts = Output.empty();
        this.commands = Output.empty();
        this.createTime = Output.empty();
        this.creator = Output.empty();
        this.endTime = Output.empty();
        this.id = Output.empty();
        this.logsUri = Output.empty();
        this.project = Output.empty();
        this.sourceProvenance = Output.empty();
        this.startTime = Output.empty();
        this.triggerId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildProvenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> buildOptions;
        private @Nullable Output<String> builderVersion;
        private @Nullable Output<List<ArtifactArgs>> builtArtifacts;
        private @Nullable Output<List<CommandArgs>> commands;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> creator;
        private @Nullable Output<String> endTime;
        private Output<String> id;
        private @Nullable Output<String> logsUri;
        private @Nullable Output<String> project;
        private @Nullable Output<SourceArgs> sourceProvenance;
        private @Nullable Output<String> startTime;
        private @Nullable Output<String> triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildProvenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildOptions = defaults.buildOptions;
    	      this.builderVersion = defaults.builderVersion;
    	      this.builtArtifacts = defaults.builtArtifacts;
    	      this.commands = defaults.commands;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.logsUri = defaults.logsUri;
    	      this.project = defaults.project;
    	      this.sourceProvenance = defaults.sourceProvenance;
    	      this.startTime = defaults.startTime;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder buildOptions(@Nullable Output<Map<String,String>> buildOptions) {
            this.buildOptions = buildOptions;
            return this;
        }

        public Builder buildOptions(@Nullable Map<String,String> buildOptions) {
            this.buildOptions = Output.ofNullable(buildOptions);
            return this;
        }

        public Builder builderVersion(@Nullable Output<String> builderVersion) {
            this.builderVersion = builderVersion;
            return this;
        }

        public Builder builderVersion(@Nullable String builderVersion) {
            this.builderVersion = Output.ofNullable(builderVersion);
            return this;
        }

        public Builder builtArtifacts(@Nullable Output<List<ArtifactArgs>> builtArtifacts) {
            this.builtArtifacts = builtArtifacts;
            return this;
        }

        public Builder builtArtifacts(@Nullable List<ArtifactArgs> builtArtifacts) {
            this.builtArtifacts = Output.ofNullable(builtArtifacts);
            return this;
        }

        public Builder commands(@Nullable Output<List<CommandArgs>> commands) {
            this.commands = commands;
            return this;
        }

        public Builder commands(@Nullable List<CommandArgs> commands) {
            this.commands = Output.ofNullable(commands);
            return this;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder creator(@Nullable Output<String> creator) {
            this.creator = creator;
            return this;
        }

        public Builder creator(@Nullable String creator) {
            this.creator = Output.ofNullable(creator);
            return this;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder logsUri(@Nullable Output<String> logsUri) {
            this.logsUri = logsUri;
            return this;
        }

        public Builder logsUri(@Nullable String logsUri) {
            this.logsUri = Output.ofNullable(logsUri);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder sourceProvenance(@Nullable Output<SourceArgs> sourceProvenance) {
            this.sourceProvenance = sourceProvenance;
            return this;
        }

        public Builder sourceProvenance(@Nullable SourceArgs sourceProvenance) {
            this.sourceProvenance = Output.ofNullable(sourceProvenance);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder triggerId(@Nullable Output<String> triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public Builder triggerId(@Nullable String triggerId) {
            this.triggerId = Output.ofNullable(triggerId);
            return this;
        }
        public BuildProvenanceArgs build() {
            return new BuildProvenanceArgs(buildOptions, builderVersion, builtArtifacts, commands, createTime, creator, endTime, id, logsUri, project, sourceProvenance, startTime, triggerId);
        }
    }
}

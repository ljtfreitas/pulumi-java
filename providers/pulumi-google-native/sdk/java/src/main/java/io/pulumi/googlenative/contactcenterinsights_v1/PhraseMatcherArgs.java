// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.contactcenterinsights_v1.enums.PhraseMatcherRoleMatch;
import io.pulumi.googlenative.contactcenterinsights_v1.enums.PhraseMatcherType;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PhraseMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhraseMatcherArgs Empty = new PhraseMatcherArgs();

    /**
     * Applies the phrase matcher only when it is active.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of phase match rule groups that are included in this matcher.
     * 
     */
    @Import(name="phraseMatchRuleGroups")
      private final @Nullable Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups;

    public Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> getPhraseMatchRuleGroups() {
        return this.phraseMatchRuleGroups == null ? Output.empty() : this.phraseMatchRuleGroups;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
     */
    @Import(name="roleMatch")
      private final @Nullable Output<PhraseMatcherRoleMatch> roleMatch;

    public Output<PhraseMatcherRoleMatch> getRoleMatch() {
        return this.roleMatch == null ? Output.empty() : this.roleMatch;
    }

    /**
     * The type of this phrase matcher.
     * 
     */
    @Import(name="type", required=true)
      private final Output<PhraseMatcherType> type;

    public Output<PhraseMatcherType> getType() {
        return this.type;
    }

    /**
     * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
     */
    @Import(name="versionTag")
      private final @Nullable Output<String> versionTag;

    public Output<String> getVersionTag() {
        return this.versionTag == null ? Output.empty() : this.versionTag;
    }

    public PhraseMatcherArgs(
        @Nullable Output<Boolean> active,
        @Nullable Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups,
        @Nullable Output<String> project,
        @Nullable Output<PhraseMatcherRoleMatch> roleMatch,
        Output<PhraseMatcherType> type,
        @Nullable Output<String> versionTag) {
        this.active = active;
        this.displayName = displayName;
        this.location = location;
        this.name = name;
        this.phraseMatchRuleGroups = phraseMatchRuleGroups;
        this.project = project;
        this.roleMatch = roleMatch;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.versionTag = versionTag;
    }

    private PhraseMatcherArgs() {
        this.active = Output.empty();
        this.displayName = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.phraseMatchRuleGroups = Output.empty();
        this.project = Output.empty();
        this.roleMatch = Output.empty();
        this.type = Output.empty();
        this.versionTag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhraseMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups;
        private @Nullable Output<String> project;
        private @Nullable Output<PhraseMatcherRoleMatch> roleMatch;
        private Output<PhraseMatcherType> type;
        private @Nullable Output<String> versionTag;

        public Builder() {
    	      // Empty
        }

        public Builder(PhraseMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.phraseMatchRuleGroups = defaults.phraseMatchRuleGroups;
    	      this.project = defaults.project;
    	      this.roleMatch = defaults.roleMatch;
    	      this.type = defaults.type;
    	      this.versionTag = defaults.versionTag;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder active(@Nullable Boolean active) {
            this.active = Output.ofNullable(active);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder phraseMatchRuleGroups(@Nullable Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups) {
            this.phraseMatchRuleGroups = phraseMatchRuleGroups;
            return this;
        }

        public Builder phraseMatchRuleGroups(@Nullable List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs> phraseMatchRuleGroups) {
            this.phraseMatchRuleGroups = Output.ofNullable(phraseMatchRuleGroups);
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

        public Builder roleMatch(@Nullable Output<PhraseMatcherRoleMatch> roleMatch) {
            this.roleMatch = roleMatch;
            return this;
        }

        public Builder roleMatch(@Nullable PhraseMatcherRoleMatch roleMatch) {
            this.roleMatch = Output.ofNullable(roleMatch);
            return this;
        }

        public Builder type(Output<PhraseMatcherType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(PhraseMatcherType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder versionTag(@Nullable Output<String> versionTag) {
            this.versionTag = versionTag;
            return this;
        }

        public Builder versionTag(@Nullable String versionTag) {
            this.versionTag = Output.ofNullable(versionTag);
            return this;
        }
        public PhraseMatcherArgs build() {
            return new PhraseMatcherArgs(active, displayName, location, name, phraseMatchRuleGroups, project, roleMatch, type, versionTag);
        }
    }
}

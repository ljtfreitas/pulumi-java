// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.WorkteamMemberDefinitionGetArgs;
import io.pulumi.aws.sagemaker.inputs.WorkteamNotificationConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkteamState extends io.pulumi.resources.ResourceArgs {

    public static final WorkteamState Empty = new WorkteamState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Workteam.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A description of the work team.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A list of Member Definitions that contains objects that identify the workers that make up the work team. Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For private workforces created using Amazon Cognito use `cognito_member_definition`. For workforces created using your own OIDC identity provider (IdP) use `oidc_member_definition`. Do not provide input for both of these parameters in a single request. see Member Definition details below.
     * 
     */
    @InputImport(name="memberDefinitions")
    private final @Nullable Input<List<WorkteamMemberDefinitionGetArgs>> memberDefinitions;

    public Input<List<WorkteamMemberDefinitionGetArgs>> getMemberDefinitions() {
        return this.memberDefinitions == null ? Input.empty() : this.memberDefinitions;
    }

    /**
     * Configures notification of workers regarding available or expiring work items. see Notification Configuration details below.
     * 
     */
    @InputImport(name="notificationConfiguration")
    private final @Nullable Input<WorkteamNotificationConfigurationGetArgs> notificationConfiguration;

    public Input<WorkteamNotificationConfigurationGetArgs> getNotificationConfiguration() {
        return this.notificationConfiguration == null ? Input.empty() : this.notificationConfiguration;
    }

    /**
     * The subdomain for your OIDC Identity Provider.
     * 
     */
    @InputImport(name="subdomain")
    private final @Nullable Input<String> subdomain;

    public Input<String> getSubdomain() {
        return this.subdomain == null ? Input.empty() : this.subdomain;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The name of the Workteam (must be unique).
     * 
     */
    @InputImport(name="workforceName")
    private final @Nullable Input<String> workforceName;

    public Input<String> getWorkforceName() {
        return this.workforceName == null ? Input.empty() : this.workforceName;
    }

    /**
     * The name of the workforce.
     * 
     */
    @InputImport(name="workteamName")
    private final @Nullable Input<String> workteamName;

    public Input<String> getWorkteamName() {
        return this.workteamName == null ? Input.empty() : this.workteamName;
    }

    public WorkteamState(
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<List<WorkteamMemberDefinitionGetArgs>> memberDefinitions,
        @Nullable Input<WorkteamNotificationConfigurationGetArgs> notificationConfiguration,
        @Nullable Input<String> subdomain,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> workforceName,
        @Nullable Input<String> workteamName) {
        this.arn = arn;
        this.description = description;
        this.memberDefinitions = memberDefinitions;
        this.notificationConfiguration = notificationConfiguration;
        this.subdomain = subdomain;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.workforceName = workforceName;
        this.workteamName = workteamName;
    }

    private WorkteamState() {
        this.arn = Input.empty();
        this.description = Input.empty();
        this.memberDefinitions = Input.empty();
        this.notificationConfiguration = Input.empty();
        this.subdomain = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.workforceName = Input.empty();
        this.workteamName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<List<WorkteamMemberDefinitionGetArgs>> memberDefinitions;
        private @Nullable Input<WorkteamNotificationConfigurationGetArgs> notificationConfiguration;
        private @Nullable Input<String> subdomain;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> workforceName;
        private @Nullable Input<String> workteamName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.memberDefinitions = defaults.memberDefinitions;
    	      this.notificationConfiguration = defaults.notificationConfiguration;
    	      this.subdomain = defaults.subdomain;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.workforceName = defaults.workforceName;
    	      this.workteamName = defaults.workteamName;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder setMemberDefinitions(@Nullable Input<List<WorkteamMemberDefinitionGetArgs>> memberDefinitions) {
            this.memberDefinitions = memberDefinitions;
            return this;
        }

        public Builder setMemberDefinitions(@Nullable List<WorkteamMemberDefinitionGetArgs> memberDefinitions) {
            this.memberDefinitions = Input.ofNullable(memberDefinitions);
            return this;
        }

        public Builder setNotificationConfiguration(@Nullable Input<WorkteamNotificationConfigurationGetArgs> notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration;
            return this;
        }

        public Builder setNotificationConfiguration(@Nullable WorkteamNotificationConfigurationGetArgs notificationConfiguration) {
            this.notificationConfiguration = Input.ofNullable(notificationConfiguration);
            return this;
        }

        public Builder setSubdomain(@Nullable Input<String> subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        public Builder setSubdomain(@Nullable String subdomain) {
            this.subdomain = Input.ofNullable(subdomain);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setWorkforceName(@Nullable Input<String> workforceName) {
            this.workforceName = workforceName;
            return this;
        }

        public Builder setWorkforceName(@Nullable String workforceName) {
            this.workforceName = Input.ofNullable(workforceName);
            return this;
        }

        public Builder setWorkteamName(@Nullable Input<String> workteamName) {
            this.workteamName = workteamName;
            return this;
        }

        public Builder setWorkteamName(@Nullable String workteamName) {
            this.workteamName = Input.ofNullable(workteamName);
            return this;
        }
        public WorkteamState build() {
            return new WorkteamState(arn, description, memberDefinitions, notificationConfiguration, subdomain, tags, tagsAll, workforceName, workteamName);
        }
    }
}

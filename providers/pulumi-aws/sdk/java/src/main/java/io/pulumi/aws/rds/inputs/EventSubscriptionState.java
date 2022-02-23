// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionState Empty = new EventSubscriptionState();

    /**
     * The Amazon Resource Name of the RDS event notification subscription
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The AWS customer account associated with the RDS event notification subscription
     * 
     */
    @InputImport(name="customerAwsId")
    private final @Nullable Input<String> customerAwsId;

    public Input<String> getCustomerAwsId() {
        return this.customerAwsId == null ? Input.empty() : this.customerAwsId;
    }

    /**
     * A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * A list of event categories for a SourceType that you want to subscribe to. See http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html or run `aws rds describe-event-categories`.
     * 
     */
    @InputImport(name="eventCategories")
    private final @Nullable Input<List<String>> eventCategories;

    public Input<List<String>> getEventCategories() {
        return this.eventCategories == null ? Input.empty() : this.eventCategories;
    }

    /**
     * The name of the DB event subscription. By default generated by this provider.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the DB event subscription. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The SNS topic to send events to.
     * 
     */
    @InputImport(name="snsTopic")
    private final @Nullable Input<String> snsTopic;

    public Input<String> getSnsTopic() {
        return this.snsTopic == null ? Input.empty() : this.snsTopic;
    }

    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
     * 
     */
    @InputImport(name="sourceIds")
    private final @Nullable Input<List<String>> sourceIds;

    public Input<List<String>> getSourceIds() {
        return this.sourceIds == null ? Input.empty() : this.sourceIds;
    }

    /**
     * The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    @InputImport(name="sourceType")
    private final @Nullable Input<String> sourceType;

    public Input<String> getSourceType() {
        return this.sourceType == null ? Input.empty() : this.sourceType;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public EventSubscriptionState(
        @Nullable Input<String> arn,
        @Nullable Input<String> customerAwsId,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<String>> eventCategories,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> snsTopic,
        @Nullable Input<List<String>> sourceIds,
        @Nullable Input<String> sourceType,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.customerAwsId = customerAwsId;
        this.enabled = enabled;
        this.eventCategories = eventCategories;
        this.name = name;
        this.namePrefix = namePrefix;
        this.snsTopic = snsTopic;
        this.sourceIds = sourceIds;
        this.sourceType = sourceType;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private EventSubscriptionState() {
        this.arn = Input.empty();
        this.customerAwsId = Input.empty();
        this.enabled = Input.empty();
        this.eventCategories = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.snsTopic = Input.empty();
        this.sourceIds = Input.empty();
        this.sourceType = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> customerAwsId;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<String>> eventCategories;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> snsTopic;
        private @Nullable Input<List<String>> sourceIds;
        private @Nullable Input<String> sourceType;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.customerAwsId = defaults.customerAwsId;
    	      this.enabled = defaults.enabled;
    	      this.eventCategories = defaults.eventCategories;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.snsTopic = defaults.snsTopic;
    	      this.sourceIds = defaults.sourceIds;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCustomerAwsId(@Nullable Input<String> customerAwsId) {
            this.customerAwsId = customerAwsId;
            return this;
        }

        public Builder setCustomerAwsId(@Nullable String customerAwsId) {
            this.customerAwsId = Input.ofNullable(customerAwsId);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEventCategories(@Nullable Input<List<String>> eventCategories) {
            this.eventCategories = eventCategories;
            return this;
        }

        public Builder setEventCategories(@Nullable List<String> eventCategories) {
            this.eventCategories = Input.ofNullable(eventCategories);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setSnsTopic(@Nullable Input<String> snsTopic) {
            this.snsTopic = snsTopic;
            return this;
        }

        public Builder setSnsTopic(@Nullable String snsTopic) {
            this.snsTopic = Input.ofNullable(snsTopic);
            return this;
        }

        public Builder setSourceIds(@Nullable Input<List<String>> sourceIds) {
            this.sourceIds = sourceIds;
            return this;
        }

        public Builder setSourceIds(@Nullable List<String> sourceIds) {
            this.sourceIds = Input.ofNullable(sourceIds);
            return this;
        }

        public Builder setSourceType(@Nullable Input<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = Input.ofNullable(sourceType);
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
        public EventSubscriptionState build() {
            return new EventSubscriptionState(arn, customerAwsId, enabled, eventCategories, name, namePrefix, snsTopic, sourceIds, sourceType, tags, tagsAll);
        }
    }
}

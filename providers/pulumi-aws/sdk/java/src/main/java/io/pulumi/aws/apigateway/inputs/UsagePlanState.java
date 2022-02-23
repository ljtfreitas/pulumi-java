// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.aws.apigateway.inputs.UsagePlanApiStageGetArgs;
import io.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsGetArgs;
import io.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanState extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanState Empty = new UsagePlanState();

    /**
     * The associated API stages of the usage plan.
     * 
     */
    @InputImport(name="apiStages")
    private final @Nullable Input<List<UsagePlanApiStageGetArgs>> apiStages;

    public Input<List<UsagePlanApiStageGetArgs>> getApiStages() {
        return this.apiStages == null ? Input.empty() : this.apiStages;
    }

    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The description of a usage plan.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the usage plan.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The AWS Marketplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
     * 
     */
    @InputImport(name="productCode")
    private final @Nullable Input<String> productCode;

    public Input<String> getProductCode() {
        return this.productCode == null ? Input.empty() : this.productCode;
    }

    /**
     * The quota settings of the usage plan.
     * 
     */
    @InputImport(name="quotaSettings")
    private final @Nullable Input<UsagePlanQuotaSettingsGetArgs> quotaSettings;

    public Input<UsagePlanQuotaSettingsGetArgs> getQuotaSettings() {
        return this.quotaSettings == null ? Input.empty() : this.quotaSettings;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * The throttling limits of the usage plan.
     * 
     */
    @InputImport(name="throttleSettings")
    private final @Nullable Input<UsagePlanThrottleSettingsGetArgs> throttleSettings;

    public Input<UsagePlanThrottleSettingsGetArgs> getThrottleSettings() {
        return this.throttleSettings == null ? Input.empty() : this.throttleSettings;
    }

    public UsagePlanState(
        @Nullable Input<List<UsagePlanApiStageGetArgs>> apiStages,
        @Nullable Input<String> arn,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> productCode,
        @Nullable Input<UsagePlanQuotaSettingsGetArgs> quotaSettings,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<UsagePlanThrottleSettingsGetArgs> throttleSettings) {
        this.apiStages = apiStages;
        this.arn = arn;
        this.description = description;
        this.name = name;
        this.productCode = productCode;
        this.quotaSettings = quotaSettings;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.throttleSettings = throttleSettings;
    }

    private UsagePlanState() {
        this.apiStages = Input.empty();
        this.arn = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.productCode = Input.empty();
        this.quotaSettings = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.throttleSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UsagePlanApiStageGetArgs>> apiStages;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> productCode;
        private @Nullable Input<UsagePlanQuotaSettingsGetArgs> quotaSettings;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<UsagePlanThrottleSettingsGetArgs> throttleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiStages = defaults.apiStages;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.productCode = defaults.productCode;
    	      this.quotaSettings = defaults.quotaSettings;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.throttleSettings = defaults.throttleSettings;
        }

        public Builder setApiStages(@Nullable Input<List<UsagePlanApiStageGetArgs>> apiStages) {
            this.apiStages = apiStages;
            return this;
        }

        public Builder setApiStages(@Nullable List<UsagePlanApiStageGetArgs> apiStages) {
            this.apiStages = Input.ofNullable(apiStages);
            return this;
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProductCode(@Nullable Input<String> productCode) {
            this.productCode = productCode;
            return this;
        }

        public Builder setProductCode(@Nullable String productCode) {
            this.productCode = Input.ofNullable(productCode);
            return this;
        }

        public Builder setQuotaSettings(@Nullable Input<UsagePlanQuotaSettingsGetArgs> quotaSettings) {
            this.quotaSettings = quotaSettings;
            return this;
        }

        public Builder setQuotaSettings(@Nullable UsagePlanQuotaSettingsGetArgs quotaSettings) {
            this.quotaSettings = Input.ofNullable(quotaSettings);
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

        public Builder setThrottleSettings(@Nullable Input<UsagePlanThrottleSettingsGetArgs> throttleSettings) {
            this.throttleSettings = throttleSettings;
            return this;
        }

        public Builder setThrottleSettings(@Nullable UsagePlanThrottleSettingsGetArgs throttleSettings) {
            this.throttleSettings = Input.ofNullable(throttleSettings);
            return this;
        }
        public UsagePlanState build() {
            return new UsagePlanState(apiStages, arn, description, name, productCode, quotaSettings, tags, tagsAll, throttleSettings);
        }
    }
}

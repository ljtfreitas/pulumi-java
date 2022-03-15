// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.outputs;

import io.pulumi.awsnative.resiliencehub.outputs.AppResourceMapping;
import io.pulumi.awsnative.resiliencehub.outputs.AppTagMap;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppResult {
    /**
     * Amazon Resource Name (ARN) of the App.
     * 
     */
    private final @Nullable String appArn;
    /**
     * A string containing full ResilienceHub app template body.
     * 
     */
    private final @Nullable String appTemplateBody;
    /**
     * App description.
     * 
     */
    private final @Nullable String description;
    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
     */
    private final @Nullable String resiliencyPolicyArn;
    /**
     * An array of ResourceMapping objects.
     * 
     */
    private final @Nullable List<AppResourceMapping> resourceMappings;
    private final @Nullable AppTagMap tags;

    @CustomType.Constructor
    private GetAppResult(
        @CustomType.Parameter("appArn") @Nullable String appArn,
        @CustomType.Parameter("appTemplateBody") @Nullable String appTemplateBody,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("resiliencyPolicyArn") @Nullable String resiliencyPolicyArn,
        @CustomType.Parameter("resourceMappings") @Nullable List<AppResourceMapping> resourceMappings,
        @CustomType.Parameter("tags") @Nullable AppTagMap tags) {
        this.appArn = appArn;
        this.appTemplateBody = appTemplateBody;
        this.description = description;
        this.resiliencyPolicyArn = resiliencyPolicyArn;
        this.resourceMappings = resourceMappings;
        this.tags = tags;
    }

    /**
     * Amazon Resource Name (ARN) of the App.
     * 
    */
    public Optional<String> getAppArn() {
        return Optional.ofNullable(this.appArn);
    }
    /**
     * A string containing full ResilienceHub app template body.
     * 
    */
    public Optional<String> getAppTemplateBody() {
        return Optional.ofNullable(this.appTemplateBody);
    }
    /**
     * App description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Amazon Resource Name (ARN) of the Resiliency Policy.
     * 
    */
    public Optional<String> getResiliencyPolicyArn() {
        return Optional.ofNullable(this.resiliencyPolicyArn);
    }
    /**
     * An array of ResourceMapping objects.
     * 
    */
    public List<AppResourceMapping> getResourceMappings() {
        return this.resourceMappings == null ? List.of() : this.resourceMappings;
    }
    public Optional<AppTagMap> getTags() {
        return Optional.ofNullable(this.tags);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appArn;
        private @Nullable String appTemplateBody;
        private @Nullable String description;
        private @Nullable String resiliencyPolicyArn;
        private @Nullable List<AppResourceMapping> resourceMappings;
        private @Nullable AppTagMap tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appArn = defaults.appArn;
    	      this.appTemplateBody = defaults.appTemplateBody;
    	      this.description = defaults.description;
    	      this.resiliencyPolicyArn = defaults.resiliencyPolicyArn;
    	      this.resourceMappings = defaults.resourceMappings;
    	      this.tags = defaults.tags;
        }

        public Builder appArn(@Nullable String appArn) {
            this.appArn = appArn;
            return this;
        }

        public Builder appTemplateBody(@Nullable String appTemplateBody) {
            this.appTemplateBody = appTemplateBody;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder resiliencyPolicyArn(@Nullable String resiliencyPolicyArn) {
            this.resiliencyPolicyArn = resiliencyPolicyArn;
            return this;
        }

        public Builder resourceMappings(@Nullable List<AppResourceMapping> resourceMappings) {
            this.resourceMappings = resourceMappings;
            return this;
        }

        public Builder tags(@Nullable AppTagMap tags) {
            this.tags = tags;
            return this;
        }
        public GetAppResult build() {
            return new GetAppResult(appArn, appTemplateBody, description, resiliencyPolicyArn, resourceMappings, tags);
        }
    }
}

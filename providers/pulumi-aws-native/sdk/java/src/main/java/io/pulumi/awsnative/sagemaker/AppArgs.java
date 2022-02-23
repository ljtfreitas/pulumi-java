// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.enums.AppType;
import io.pulumi.awsnative.sagemaker.inputs.AppResourceSpecArgs;
import io.pulumi.awsnative.sagemaker.inputs.AppTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppArgs Empty = new AppArgs();

    /**
     * The name of the app.
     * 
     */
    @InputImport(name="appName")
        private final @Nullable Input<String> appName;

    public Input<String> getAppName() {
        return this.appName == null ? Input.empty() : this.appName;
    }

    /**
     * The type of app.
     * 
     */
    @InputImport(name="appType", required=true)
        private final Input<AppType> appType;

    public Input<AppType> getAppType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @InputImport(name="domainId", required=true)
        private final Input<String> domainId;

    public Input<String> getDomainId() {
        return this.domainId;
    }

    /**
     * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * 
     */
    @InputImport(name="resourceSpec")
        private final @Nullable Input<AppResourceSpecArgs> resourceSpec;

    public Input<AppResourceSpecArgs> getResourceSpec() {
        return this.resourceSpec == null ? Input.empty() : this.resourceSpec;
    }

    /**
     * A list of tags to apply to the app.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<AppTagArgs>> tags;

    public Input<List<AppTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The user profile name.
     * 
     */
    @InputImport(name="userProfileName", required=true)
        private final Input<String> userProfileName;

    public Input<String> getUserProfileName() {
        return this.userProfileName;
    }

    public AppArgs(
        @Nullable Input<String> appName,
        Input<AppType> appType,
        Input<String> domainId,
        @Nullable Input<AppResourceSpecArgs> resourceSpec,
        @Nullable Input<List<AppTagArgs>> tags,
        Input<String> userProfileName) {
        this.appName = appName;
        this.appType = Objects.requireNonNull(appType, "expected parameter 'appType' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.resourceSpec = resourceSpec;
        this.tags = tags;
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
    }

    private AppArgs() {
        this.appName = Input.empty();
        this.appType = Input.empty();
        this.domainId = Input.empty();
        this.resourceSpec = Input.empty();
        this.tags = Input.empty();
        this.userProfileName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appName;
        private Input<AppType> appType;
        private Input<String> domainId;
        private @Nullable Input<AppResourceSpecArgs> resourceSpec;
        private @Nullable Input<List<AppTagArgs>> tags;
        private Input<String> userProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.appType = defaults.appType;
    	      this.domainId = defaults.domainId;
    	      this.resourceSpec = defaults.resourceSpec;
    	      this.tags = defaults.tags;
    	      this.userProfileName = defaults.userProfileName;
        }

        public Builder setAppName(@Nullable Input<String> appName) {
            this.appName = appName;
            return this;
        }

        public Builder setAppName(@Nullable String appName) {
            this.appName = Input.ofNullable(appName);
            return this;
        }

        public Builder setAppType(Input<AppType> appType) {
            this.appType = Objects.requireNonNull(appType);
            return this;
        }

        public Builder setAppType(AppType appType) {
            this.appType = Input.of(Objects.requireNonNull(appType));
            return this;
        }

        public Builder setDomainId(Input<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Input.of(Objects.requireNonNull(domainId));
            return this;
        }

        public Builder setResourceSpec(@Nullable Input<AppResourceSpecArgs> resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        public Builder setResourceSpec(@Nullable AppResourceSpecArgs resourceSpec) {
            this.resourceSpec = Input.ofNullable(resourceSpec);
            return this;
        }

        public Builder setTags(@Nullable Input<List<AppTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AppTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserProfileName(Input<String> userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }

        public Builder setUserProfileName(String userProfileName) {
            this.userProfileName = Input.of(Objects.requireNonNull(userProfileName));
            return this;
        }
        public AppArgs build() {
            return new AppArgs(appName, appType, domainId, resourceSpec, tags, userProfileName);
        }
    }
}

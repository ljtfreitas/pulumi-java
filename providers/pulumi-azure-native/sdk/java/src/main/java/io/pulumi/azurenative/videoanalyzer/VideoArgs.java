// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoArgs Empty = new VideoArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    @InputImport(name="title")
        private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    /**
     * The name of the video to create or update.
     * 
     */
    @InputImport(name="videoName")
        private final @Nullable Input<String> videoName;

    public Input<String> getVideoName() {
        return this.videoName == null ? Input.empty() : this.videoName;
    }

    public VideoArgs(
        Input<String> accountName,
        @Nullable Input<String> description,
        Input<String> resourceGroupName,
        @Nullable Input<String> title,
        @Nullable Input<String> videoName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.title = title;
        this.videoName = videoName;
    }

    private VideoArgs() {
        this.accountName = Input.empty();
        this.description = Input.empty();
        this.resourceGroupName = Input.empty();
        this.title = Input.empty();
        this.videoName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> description;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> title;
        private @Nullable Input<String> videoName;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.title = defaults.title;
    	      this.videoName = defaults.videoName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setVideoName(@Nullable Input<String> videoName) {
            this.videoName = videoName;
            return this;
        }

        public Builder setVideoName(@Nullable String videoName) {
            this.videoName = Input.ofNullable(videoName);
            return this;
        }
        public VideoArgs build() {
            return new VideoArgs(accountName, description, resourceGroupName, title, videoName);
        }
    }
}

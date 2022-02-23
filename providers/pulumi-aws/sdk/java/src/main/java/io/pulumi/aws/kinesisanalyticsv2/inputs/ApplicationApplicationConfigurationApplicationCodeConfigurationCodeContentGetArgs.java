// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs();

    /**
     * Information about the Amazon S3 bucket containing the application code.
     * 
     */
    @InputImport(name="s3ContentLocation")
    private final @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation;

    public Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> getS3ContentLocation() {
        return this.s3ContentLocation == null ? Input.empty() : this.s3ContentLocation;
    }

    /**
     * The text-format code for the application.
     * 
     */
    @InputImport(name="textContent")
    private final @Nullable Input<String> textContent;

    public Input<String> getTextContent() {
        return this.textContent == null ? Input.empty() : this.textContent;
    }

    public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs(
        @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation,
        @Nullable Input<String> textContent) {
        this.s3ContentLocation = s3ContentLocation;
        this.textContent = textContent;
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs() {
        this.s3ContentLocation = Input.empty();
        this.textContent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation;
        private @Nullable Input<String> textContent;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3ContentLocation = defaults.s3ContentLocation;
    	      this.textContent = defaults.textContent;
        }

        public Builder setS3ContentLocation(@Nullable Input<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs> s3ContentLocation) {
            this.s3ContentLocation = s3ContentLocation;
            return this;
        }

        public Builder setS3ContentLocation(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationGetArgs s3ContentLocation) {
            this.s3ContentLocation = Input.ofNullable(s3ContentLocation);
            return this;
        }

        public Builder setTextContent(@Nullable Input<String> textContent) {
            this.textContent = textContent;
            return this;
        }

        public Builder setTextContent(@Nullable String textContent) {
            this.textContent = Input.ofNullable(textContent);
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs(s3ContentLocation, textContent);
        }
    }
}

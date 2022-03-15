// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationArgs();

    /**
     * The location and type of the application code.
     * 
     */
    @Import(name="codeContent")
      private final @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs> codeContent;

    public Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs> getCodeContent() {
        return this.codeContent == null ? Output.empty() : this.codeContent;
    }

    /**
     * Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
     * 
     */
    @Import(name="codeContentType", required=true)
      private final Output<String> codeContentType;

    public Output<String> getCodeContentType() {
        return this.codeContentType;
    }

    public ApplicationApplicationConfigurationApplicationCodeConfigurationArgs(
        @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs> codeContent,
        Output<String> codeContentType) {
        this.codeContent = codeContent;
        this.codeContentType = Objects.requireNonNull(codeContentType, "expected parameter 'codeContentType' to be non-null");
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationArgs() {
        this.codeContent = Output.empty();
        this.codeContentType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs> codeContent;
        private Output<String> codeContentType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeContent = defaults.codeContent;
    	      this.codeContentType = defaults.codeContentType;
        }

        public Builder codeContent(@Nullable Output<ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs> codeContent) {
            this.codeContent = codeContent;
            return this;
        }

        public Builder codeContent(@Nullable ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentArgs codeContent) {
            this.codeContent = Output.ofNullable(codeContent);
            return this;
        }

        public Builder codeContentType(Output<String> codeContentType) {
            this.codeContentType = Objects.requireNonNull(codeContentType);
            return this;
        }

        public Builder codeContentType(String codeContentType) {
            this.codeContentType = Output.of(Objects.requireNonNull(codeContentType));
            return this;
        }
        public ApplicationApplicationConfigurationApplicationCodeConfigurationArgs build() {
            return new ApplicationApplicationConfigurationApplicationCodeConfigurationArgs(codeContent, codeContentType);
        }
    }
}

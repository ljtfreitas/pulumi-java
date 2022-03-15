// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.appengine_v1beta.enums.ErrorHandlerErrorCode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom static error page to be served when an error occurs.
 * 
 */
public final class ErrorHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ErrorHandlerArgs Empty = new ErrorHandlerArgs();

    /**
     * Error condition this handler applies to.
     * 
     */
    @Import(name="errorCode")
      private final @Nullable Output<ErrorHandlerErrorCode> errorCode;

    public Output<ErrorHandlerErrorCode> getErrorCode() {
        return this.errorCode == null ? Output.empty() : this.errorCode;
    }

    /**
     * MIME type of file. Defaults to text/html.
     * 
     */
    @Import(name="mimeType")
      private final @Nullable Output<String> mimeType;

    public Output<String> getMimeType() {
        return this.mimeType == null ? Output.empty() : this.mimeType;
    }

    /**
     * Static file content to be served for this error.
     * 
     */
    @Import(name="staticFile")
      private final @Nullable Output<String> staticFile;

    public Output<String> getStaticFile() {
        return this.staticFile == null ? Output.empty() : this.staticFile;
    }

    public ErrorHandlerArgs(
        @Nullable Output<ErrorHandlerErrorCode> errorCode,
        @Nullable Output<String> mimeType,
        @Nullable Output<String> staticFile) {
        this.errorCode = errorCode;
        this.mimeType = mimeType;
        this.staticFile = staticFile;
    }

    private ErrorHandlerArgs() {
        this.errorCode = Output.empty();
        this.mimeType = Output.empty();
        this.staticFile = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ErrorHandlerErrorCode> errorCode;
        private @Nullable Output<String> mimeType;
        private @Nullable Output<String> staticFile;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.mimeType = defaults.mimeType;
    	      this.staticFile = defaults.staticFile;
        }

        public Builder errorCode(@Nullable Output<ErrorHandlerErrorCode> errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorCode(@Nullable ErrorHandlerErrorCode errorCode) {
            this.errorCode = Output.ofNullable(errorCode);
            return this;
        }

        public Builder mimeType(@Nullable Output<String> mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder mimeType(@Nullable String mimeType) {
            this.mimeType = Output.ofNullable(mimeType);
            return this;
        }

        public Builder staticFile(@Nullable Output<String> staticFile) {
            this.staticFile = staticFile;
            return this;
        }

        public Builder staticFile(@Nullable String staticFile) {
            this.staticFile = Output.ofNullable(staticFile);
            return this;
        }
        public ErrorHandlerArgs build() {
            return new ErrorHandlerArgs(errorCode, mimeType, staticFile);
        }
    }
}

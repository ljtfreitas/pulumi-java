// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AS2EnvelopeSettingsResponse {
    /**
     * The value indicating whether to auto generate file name.
     * 
     */
    private final Boolean autogenerateFileName;
    /**
     * The template for file name.
     * 
     */
    private final String fileNameTemplate;
    /**
     * The message content type.
     * 
     */
    private final String messageContentType;
    /**
     * The value indicating whether to suspend message on file name generation error.
     * 
     */
    private final Boolean suspendMessageOnFileNameGenerationError;
    /**
     * The value indicating whether to transmit file name in mime header.
     * 
     */
    private final Boolean transmitFileNameInMimeHeader;

    @OutputCustomType.Constructor({"autogenerateFileName","fileNameTemplate","messageContentType","suspendMessageOnFileNameGenerationError","transmitFileNameInMimeHeader"})
    private AS2EnvelopeSettingsResponse(
        Boolean autogenerateFileName,
        String fileNameTemplate,
        String messageContentType,
        Boolean suspendMessageOnFileNameGenerationError,
        Boolean transmitFileNameInMimeHeader) {
        this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName);
        this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate);
        this.messageContentType = Objects.requireNonNull(messageContentType);
        this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError);
        this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader);
    }

    /**
     * The value indicating whether to auto generate file name.
     * 
     */
    public Boolean getAutogenerateFileName() {
        return this.autogenerateFileName;
    }
    /**
     * The template for file name.
     * 
     */
    public String getFileNameTemplate() {
        return this.fileNameTemplate;
    }
    /**
     * The message content type.
     * 
     */
    public String getMessageContentType() {
        return this.messageContentType;
    }
    /**
     * The value indicating whether to suspend message on file name generation error.
     * 
     */
    public Boolean getSuspendMessageOnFileNameGenerationError() {
        return this.suspendMessageOnFileNameGenerationError;
    }
    /**
     * The value indicating whether to transmit file name in mime header.
     * 
     */
    public Boolean getTransmitFileNameInMimeHeader() {
        return this.transmitFileNameInMimeHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2EnvelopeSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autogenerateFileName;
        private String fileNameTemplate;
        private String messageContentType;
        private Boolean suspendMessageOnFileNameGenerationError;
        private Boolean transmitFileNameInMimeHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2EnvelopeSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autogenerateFileName = defaults.autogenerateFileName;
    	      this.fileNameTemplate = defaults.fileNameTemplate;
    	      this.messageContentType = defaults.messageContentType;
    	      this.suspendMessageOnFileNameGenerationError = defaults.suspendMessageOnFileNameGenerationError;
    	      this.transmitFileNameInMimeHeader = defaults.transmitFileNameInMimeHeader;
        }

        public Builder setAutogenerateFileName(Boolean autogenerateFileName) {
            this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName);
            return this;
        }

        public Builder setFileNameTemplate(String fileNameTemplate) {
            this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate);
            return this;
        }

        public Builder setMessageContentType(String messageContentType) {
            this.messageContentType = Objects.requireNonNull(messageContentType);
            return this;
        }

        public Builder setSuspendMessageOnFileNameGenerationError(Boolean suspendMessageOnFileNameGenerationError) {
            this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError);
            return this;
        }

        public Builder setTransmitFileNameInMimeHeader(Boolean transmitFileNameInMimeHeader) {
            this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader);
            return this;
        }
        public AS2EnvelopeSettingsResponse build() {
            return new AS2EnvelopeSettingsResponse(autogenerateFileName, fileNameTemplate, messageContentType, suspendMessageOnFileNameGenerationError, transmitFileNameInMimeHeader);
        }
    }
}

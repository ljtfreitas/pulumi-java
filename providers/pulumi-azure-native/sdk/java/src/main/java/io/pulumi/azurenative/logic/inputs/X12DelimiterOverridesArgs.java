// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 delimiter override settings.
 * 
 */
public final class X12DelimiterOverridesArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12DelimiterOverridesArgs Empty = new X12DelimiterOverridesArgs();

    /**
     * The component separator.
     * 
     */
    @InputImport(name="componentSeparator", required=true)
    private final Input<Integer> componentSeparator;

    public Input<Integer> getComponentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @InputImport(name="dataElementSeparator", required=true)
    private final Input<Integer> dataElementSeparator;

    public Input<Integer> getDataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The message id.
     * 
     */
    @InputImport(name="messageId")
    private final @Nullable Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId == null ? Input.empty() : this.messageId;
    }

    /**
     * The protocol version.
     * 
     */
    @InputImport(name="protocolVersion")
    private final @Nullable Input<String> protocolVersion;

    public Input<String> getProtocolVersion() {
        return this.protocolVersion == null ? Input.empty() : this.protocolVersion;
    }

    /**
     * The replacement character.
     * 
     */
    @InputImport(name="replaceCharacter", required=true)
    private final Input<Integer> replaceCharacter;

    public Input<Integer> getReplaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    @InputImport(name="replaceSeparatorsInPayload", required=true)
    private final Input<Boolean> replaceSeparatorsInPayload;

    public Input<Boolean> getReplaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * The segment terminator.
     * 
     */
    @InputImport(name="segmentTerminator", required=true)
    private final Input<Integer> segmentTerminator;

    public Input<Integer> getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @InputImport(name="segmentTerminatorSuffix", required=true)
    private final Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Input<SegmentTerminatorSuffix> getSegmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The target namespace on which this delimiter settings has to be applied.
     * 
     */
    @InputImport(name="targetNamespace")
    private final @Nullable Input<String> targetNamespace;

    public Input<String> getTargetNamespace() {
        return this.targetNamespace == null ? Input.empty() : this.targetNamespace;
    }

    public X12DelimiterOverridesArgs(
        Input<Integer> componentSeparator,
        Input<Integer> dataElementSeparator,
        @Nullable Input<String> messageId,
        @Nullable Input<String> protocolVersion,
        Input<Integer> replaceCharacter,
        Input<Boolean> replaceSeparatorsInPayload,
        Input<Integer> segmentTerminator,
        Input<SegmentTerminatorSuffix> segmentTerminatorSuffix,
        @Nullable Input<String> targetNamespace) {
        this.componentSeparator = Objects.requireNonNull(componentSeparator, "expected parameter 'componentSeparator' to be non-null");
        this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
        this.messageId = messageId;
        this.protocolVersion = protocolVersion;
        this.replaceCharacter = Objects.requireNonNull(replaceCharacter, "expected parameter 'replaceCharacter' to be non-null");
        this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload, "expected parameter 'replaceSeparatorsInPayload' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
        this.targetNamespace = targetNamespace;
    }

    private X12DelimiterOverridesArgs() {
        this.componentSeparator = Input.empty();
        this.dataElementSeparator = Input.empty();
        this.messageId = Input.empty();
        this.protocolVersion = Input.empty();
        this.replaceCharacter = Input.empty();
        this.replaceSeparatorsInPayload = Input.empty();
        this.segmentTerminator = Input.empty();
        this.segmentTerminatorSuffix = Input.empty();
        this.targetNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12DelimiterOverridesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> componentSeparator;
        private Input<Integer> dataElementSeparator;
        private @Nullable Input<String> messageId;
        private @Nullable Input<String> protocolVersion;
        private Input<Integer> replaceCharacter;
        private Input<Boolean> replaceSeparatorsInPayload;
        private Input<Integer> segmentTerminator;
        private Input<SegmentTerminatorSuffix> segmentTerminatorSuffix;
        private @Nullable Input<String> targetNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(X12DelimiterOverridesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentSeparator = defaults.componentSeparator;
    	      this.dataElementSeparator = defaults.dataElementSeparator;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.replaceCharacter = defaults.replaceCharacter;
    	      this.replaceSeparatorsInPayload = defaults.replaceSeparatorsInPayload;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.segmentTerminatorSuffix = defaults.segmentTerminatorSuffix;
    	      this.targetNamespace = defaults.targetNamespace;
        }

        public Builder setComponentSeparator(Input<Integer> componentSeparator) {
            this.componentSeparator = Objects.requireNonNull(componentSeparator);
            return this;
        }

        public Builder setComponentSeparator(Integer componentSeparator) {
            this.componentSeparator = Input.of(Objects.requireNonNull(componentSeparator));
            return this;
        }

        public Builder setDataElementSeparator(Input<Integer> dataElementSeparator) {
            this.dataElementSeparator = Objects.requireNonNull(dataElementSeparator);
            return this;
        }

        public Builder setDataElementSeparator(Integer dataElementSeparator) {
            this.dataElementSeparator = Input.of(Objects.requireNonNull(dataElementSeparator));
            return this;
        }

        public Builder setMessageId(@Nullable Input<String> messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = Input.ofNullable(messageId);
            return this;
        }

        public Builder setProtocolVersion(@Nullable Input<String> protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder setProtocolVersion(@Nullable String protocolVersion) {
            this.protocolVersion = Input.ofNullable(protocolVersion);
            return this;
        }

        public Builder setReplaceCharacter(Input<Integer> replaceCharacter) {
            this.replaceCharacter = Objects.requireNonNull(replaceCharacter);
            return this;
        }

        public Builder setReplaceCharacter(Integer replaceCharacter) {
            this.replaceCharacter = Input.of(Objects.requireNonNull(replaceCharacter));
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Input<Boolean> replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Objects.requireNonNull(replaceSeparatorsInPayload);
            return this;
        }

        public Builder setReplaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            this.replaceSeparatorsInPayload = Input.of(Objects.requireNonNull(replaceSeparatorsInPayload));
            return this;
        }

        public Builder setSegmentTerminator(Input<Integer> segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setSegmentTerminator(Integer segmentTerminator) {
            this.segmentTerminator = Input.of(Objects.requireNonNull(segmentTerminator));
            return this;
        }

        public Builder setSegmentTerminatorSuffix(Input<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Objects.requireNonNull(segmentTerminatorSuffix);
            return this;
        }

        public Builder setSegmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            this.segmentTerminatorSuffix = Input.of(Objects.requireNonNull(segmentTerminatorSuffix));
            return this;
        }

        public Builder setTargetNamespace(@Nullable Input<String> targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }

        public Builder setTargetNamespace(@Nullable String targetNamespace) {
            this.targetNamespace = Input.ofNullable(targetNamespace);
            return this;
        }

        public X12DelimiterOverridesArgs build() {
            return new X12DelimiterOverridesArgs(componentSeparator, dataElementSeparator, messageId, protocolVersion, replaceCharacter, replaceSeparatorsInPayload, segmentTerminator, segmentTerminatorSuffix, targetNamespace);
        }
    }
}

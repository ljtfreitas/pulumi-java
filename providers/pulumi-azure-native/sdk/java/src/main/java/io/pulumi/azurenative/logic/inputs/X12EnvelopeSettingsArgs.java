// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.UsageIndicator;
import io.pulumi.azurenative.logic.enums.X12DateFormat;
import io.pulumi.azurenative.logic.enums.X12TimeFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 agreement envelope settings.
 * 
 */
public final class X12EnvelopeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12EnvelopeSettingsArgs Empty = new X12EnvelopeSettingsArgs();

    /**
     * The controls standards id.
     * 
     */
    @InputImport(name="controlStandardsId", required=true)
    private final Input<Integer> controlStandardsId;

    public Input<Integer> getControlStandardsId() {
        return this.controlStandardsId;
    }

    /**
     * The control version number.
     * 
     */
    @InputImport(name="controlVersionNumber", required=true)
    private final Input<String> controlVersionNumber;

    public Input<String> getControlVersionNumber() {
        return this.controlVersionNumber;
    }

    /**
     * The value indicating whether to enable default group headers.
     * 
     */
    @InputImport(name="enableDefaultGroupHeaders", required=true)
    private final Input<Boolean> enableDefaultGroupHeaders;

    public Input<Boolean> getEnableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }

    /**
     * The functional group id.
     * 
     */
    @InputImport(name="functionalGroupId")
    private final @Nullable Input<String> functionalGroupId;

    public Input<String> getFunctionalGroupId() {
        return this.functionalGroupId == null ? Input.empty() : this.functionalGroupId;
    }

    /**
     * The group control number lower bound.
     * 
     */
    @InputImport(name="groupControlNumberLowerBound", required=true)
    private final Input<Integer> groupControlNumberLowerBound;

    public Input<Integer> getGroupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }

    /**
     * The group control number upper bound.
     * 
     */
    @InputImport(name="groupControlNumberUpperBound", required=true)
    private final Input<Integer> groupControlNumberUpperBound;

    public Input<Integer> getGroupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }

    /**
     * The group header agency code.
     * 
     */
    @InputImport(name="groupHeaderAgencyCode", required=true)
    private final Input<String> groupHeaderAgencyCode;

    public Input<String> getGroupHeaderAgencyCode() {
        return this.groupHeaderAgencyCode;
    }

    /**
     * The group header date format.
     * 
     */
    @InputImport(name="groupHeaderDateFormat", required=true)
    private final Input<Either<String,X12DateFormat>> groupHeaderDateFormat;

    public Input<Either<String,X12DateFormat>> getGroupHeaderDateFormat() {
        return this.groupHeaderDateFormat;
    }

    /**
     * The group header time format.
     * 
     */
    @InputImport(name="groupHeaderTimeFormat", required=true)
    private final Input<Either<String,X12TimeFormat>> groupHeaderTimeFormat;

    public Input<Either<String,X12TimeFormat>> getGroupHeaderTimeFormat() {
        return this.groupHeaderTimeFormat;
    }

    /**
     * The group header version.
     * 
     */
    @InputImport(name="groupHeaderVersion", required=true)
    private final Input<String> groupHeaderVersion;

    public Input<String> getGroupHeaderVersion() {
        return this.groupHeaderVersion;
    }

    /**
     * The interchange  control number lower bound.
     * 
     */
    @InputImport(name="interchangeControlNumberLowerBound", required=true)
    private final Input<Integer> interchangeControlNumberLowerBound;

    public Input<Integer> getInterchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }

    /**
     * The interchange  control number upper bound.
     * 
     */
    @InputImport(name="interchangeControlNumberUpperBound", required=true)
    private final Input<Integer> interchangeControlNumberUpperBound;

    public Input<Integer> getInterchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }

    /**
     * The value indicating whether to overwrite existing transaction set control number.
     * 
     */
    @InputImport(name="overwriteExistingTransactionSetControlNumber", required=true)
    private final Input<Boolean> overwriteExistingTransactionSetControlNumber;

    public Input<Boolean> getOverwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }

    /**
     * The receiver application id.
     * 
     */
    @InputImport(name="receiverApplicationId", required=true)
    private final Input<String> receiverApplicationId;

    public Input<String> getReceiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The value indicating whether to rollover group control number.
     * 
     */
    @InputImport(name="rolloverGroupControlNumber", required=true)
    private final Input<Boolean> rolloverGroupControlNumber;

    public Input<Boolean> getRolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }

    /**
     * The value indicating whether to rollover interchange control number.
     * 
     */
    @InputImport(name="rolloverInterchangeControlNumber", required=true)
    private final Input<Boolean> rolloverInterchangeControlNumber;

    public Input<Boolean> getRolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }

    /**
     * The value indicating whether to rollover transaction set control number.
     * 
     */
    @InputImport(name="rolloverTransactionSetControlNumber", required=true)
    private final Input<Boolean> rolloverTransactionSetControlNumber;

    public Input<Boolean> getRolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId", required=true)
    private final Input<String> senderApplicationId;

    public Input<String> getSenderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The transaction set control number lower bound.
     * 
     */
    @InputImport(name="transactionSetControlNumberLowerBound", required=true)
    private final Input<Integer> transactionSetControlNumberLowerBound;

    public Input<Integer> getTransactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }

    /**
     * The transaction set control number prefix.
     * 
     */
    @InputImport(name="transactionSetControlNumberPrefix")
    private final @Nullable Input<String> transactionSetControlNumberPrefix;

    public Input<String> getTransactionSetControlNumberPrefix() {
        return this.transactionSetControlNumberPrefix == null ? Input.empty() : this.transactionSetControlNumberPrefix;
    }

    /**
     * The transaction set control number suffix.
     * 
     */
    @InputImport(name="transactionSetControlNumberSuffix")
    private final @Nullable Input<String> transactionSetControlNumberSuffix;

    public Input<String> getTransactionSetControlNumberSuffix() {
        return this.transactionSetControlNumberSuffix == null ? Input.empty() : this.transactionSetControlNumberSuffix;
    }

    /**
     * The transaction set control number upper bound.
     * 
     */
    @InputImport(name="transactionSetControlNumberUpperBound", required=true)
    private final Input<Integer> transactionSetControlNumberUpperBound;

    public Input<Integer> getTransactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }

    /**
     * The usage indicator.
     * 
     */
    @InputImport(name="usageIndicator", required=true)
    private final Input<Either<String,UsageIndicator>> usageIndicator;

    public Input<Either<String,UsageIndicator>> getUsageIndicator() {
        return this.usageIndicator;
    }

    /**
     * The value indicating whether to use control standards id as repetition character.
     * 
     */
    @InputImport(name="useControlStandardsIdAsRepetitionCharacter", required=true)
    private final Input<Boolean> useControlStandardsIdAsRepetitionCharacter;

    public Input<Boolean> getUseControlStandardsIdAsRepetitionCharacter() {
        return this.useControlStandardsIdAsRepetitionCharacter;
    }

    public X12EnvelopeSettingsArgs(
        Input<Integer> controlStandardsId,
        Input<String> controlVersionNumber,
        Input<Boolean> enableDefaultGroupHeaders,
        @Nullable Input<String> functionalGroupId,
        Input<Integer> groupControlNumberLowerBound,
        Input<Integer> groupControlNumberUpperBound,
        Input<String> groupHeaderAgencyCode,
        Input<Either<String,X12DateFormat>> groupHeaderDateFormat,
        Input<Either<String,X12TimeFormat>> groupHeaderTimeFormat,
        Input<String> groupHeaderVersion,
        Input<Integer> interchangeControlNumberLowerBound,
        Input<Integer> interchangeControlNumberUpperBound,
        Input<Boolean> overwriteExistingTransactionSetControlNumber,
        Input<String> receiverApplicationId,
        Input<Boolean> rolloverGroupControlNumber,
        Input<Boolean> rolloverInterchangeControlNumber,
        Input<Boolean> rolloverTransactionSetControlNumber,
        Input<String> senderApplicationId,
        Input<Integer> transactionSetControlNumberLowerBound,
        @Nullable Input<String> transactionSetControlNumberPrefix,
        @Nullable Input<String> transactionSetControlNumberSuffix,
        Input<Integer> transactionSetControlNumberUpperBound,
        Input<Either<String,UsageIndicator>> usageIndicator,
        Input<Boolean> useControlStandardsIdAsRepetitionCharacter) {
        this.controlStandardsId = Objects.requireNonNull(controlStandardsId, "expected parameter 'controlStandardsId' to be non-null");
        this.controlVersionNumber = Objects.requireNonNull(controlVersionNumber, "expected parameter 'controlVersionNumber' to be non-null");
        this.enableDefaultGroupHeaders = Objects.requireNonNull(enableDefaultGroupHeaders, "expected parameter 'enableDefaultGroupHeaders' to be non-null");
        this.functionalGroupId = functionalGroupId;
        this.groupControlNumberLowerBound = Objects.requireNonNull(groupControlNumberLowerBound, "expected parameter 'groupControlNumberLowerBound' to be non-null");
        this.groupControlNumberUpperBound = Objects.requireNonNull(groupControlNumberUpperBound, "expected parameter 'groupControlNumberUpperBound' to be non-null");
        this.groupHeaderAgencyCode = Objects.requireNonNull(groupHeaderAgencyCode, "expected parameter 'groupHeaderAgencyCode' to be non-null");
        this.groupHeaderDateFormat = Objects.requireNonNull(groupHeaderDateFormat, "expected parameter 'groupHeaderDateFormat' to be non-null");
        this.groupHeaderTimeFormat = Objects.requireNonNull(groupHeaderTimeFormat, "expected parameter 'groupHeaderTimeFormat' to be non-null");
        this.groupHeaderVersion = Objects.requireNonNull(groupHeaderVersion, "expected parameter 'groupHeaderVersion' to be non-null");
        this.interchangeControlNumberLowerBound = Objects.requireNonNull(interchangeControlNumberLowerBound, "expected parameter 'interchangeControlNumberLowerBound' to be non-null");
        this.interchangeControlNumberUpperBound = Objects.requireNonNull(interchangeControlNumberUpperBound, "expected parameter 'interchangeControlNumberUpperBound' to be non-null");
        this.overwriteExistingTransactionSetControlNumber = Objects.requireNonNull(overwriteExistingTransactionSetControlNumber, "expected parameter 'overwriteExistingTransactionSetControlNumber' to be non-null");
        this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
        this.rolloverGroupControlNumber = Objects.requireNonNull(rolloverGroupControlNumber, "expected parameter 'rolloverGroupControlNumber' to be non-null");
        this.rolloverInterchangeControlNumber = Objects.requireNonNull(rolloverInterchangeControlNumber, "expected parameter 'rolloverInterchangeControlNumber' to be non-null");
        this.rolloverTransactionSetControlNumber = Objects.requireNonNull(rolloverTransactionSetControlNumber, "expected parameter 'rolloverTransactionSetControlNumber' to be non-null");
        this.senderApplicationId = Objects.requireNonNull(senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
        this.transactionSetControlNumberLowerBound = Objects.requireNonNull(transactionSetControlNumberLowerBound, "expected parameter 'transactionSetControlNumberLowerBound' to be non-null");
        this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
        this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
        this.transactionSetControlNumberUpperBound = Objects.requireNonNull(transactionSetControlNumberUpperBound, "expected parameter 'transactionSetControlNumberUpperBound' to be non-null");
        this.usageIndicator = Objects.requireNonNull(usageIndicator, "expected parameter 'usageIndicator' to be non-null");
        this.useControlStandardsIdAsRepetitionCharacter = Objects.requireNonNull(useControlStandardsIdAsRepetitionCharacter, "expected parameter 'useControlStandardsIdAsRepetitionCharacter' to be non-null");
    }

    private X12EnvelopeSettingsArgs() {
        this.controlStandardsId = Input.empty();
        this.controlVersionNumber = Input.empty();
        this.enableDefaultGroupHeaders = Input.empty();
        this.functionalGroupId = Input.empty();
        this.groupControlNumberLowerBound = Input.empty();
        this.groupControlNumberUpperBound = Input.empty();
        this.groupHeaderAgencyCode = Input.empty();
        this.groupHeaderDateFormat = Input.empty();
        this.groupHeaderTimeFormat = Input.empty();
        this.groupHeaderVersion = Input.empty();
        this.interchangeControlNumberLowerBound = Input.empty();
        this.interchangeControlNumberUpperBound = Input.empty();
        this.overwriteExistingTransactionSetControlNumber = Input.empty();
        this.receiverApplicationId = Input.empty();
        this.rolloverGroupControlNumber = Input.empty();
        this.rolloverInterchangeControlNumber = Input.empty();
        this.rolloverTransactionSetControlNumber = Input.empty();
        this.senderApplicationId = Input.empty();
        this.transactionSetControlNumberLowerBound = Input.empty();
        this.transactionSetControlNumberPrefix = Input.empty();
        this.transactionSetControlNumberSuffix = Input.empty();
        this.transactionSetControlNumberUpperBound = Input.empty();
        this.usageIndicator = Input.empty();
        this.useControlStandardsIdAsRepetitionCharacter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> controlStandardsId;
        private Input<String> controlVersionNumber;
        private Input<Boolean> enableDefaultGroupHeaders;
        private @Nullable Input<String> functionalGroupId;
        private Input<Integer> groupControlNumberLowerBound;
        private Input<Integer> groupControlNumberUpperBound;
        private Input<String> groupHeaderAgencyCode;
        private Input<Either<String,X12DateFormat>> groupHeaderDateFormat;
        private Input<Either<String,X12TimeFormat>> groupHeaderTimeFormat;
        private Input<String> groupHeaderVersion;
        private Input<Integer> interchangeControlNumberLowerBound;
        private Input<Integer> interchangeControlNumberUpperBound;
        private Input<Boolean> overwriteExistingTransactionSetControlNumber;
        private Input<String> receiverApplicationId;
        private Input<Boolean> rolloverGroupControlNumber;
        private Input<Boolean> rolloverInterchangeControlNumber;
        private Input<Boolean> rolloverTransactionSetControlNumber;
        private Input<String> senderApplicationId;
        private Input<Integer> transactionSetControlNumberLowerBound;
        private @Nullable Input<String> transactionSetControlNumberPrefix;
        private @Nullable Input<String> transactionSetControlNumberSuffix;
        private Input<Integer> transactionSetControlNumberUpperBound;
        private Input<Either<String,UsageIndicator>> usageIndicator;
        private Input<Boolean> useControlStandardsIdAsRepetitionCharacter;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controlStandardsId = defaults.controlStandardsId;
    	      this.controlVersionNumber = defaults.controlVersionNumber;
    	      this.enableDefaultGroupHeaders = defaults.enableDefaultGroupHeaders;
    	      this.functionalGroupId = defaults.functionalGroupId;
    	      this.groupControlNumberLowerBound = defaults.groupControlNumberLowerBound;
    	      this.groupControlNumberUpperBound = defaults.groupControlNumberUpperBound;
    	      this.groupHeaderAgencyCode = defaults.groupHeaderAgencyCode;
    	      this.groupHeaderDateFormat = defaults.groupHeaderDateFormat;
    	      this.groupHeaderTimeFormat = defaults.groupHeaderTimeFormat;
    	      this.groupHeaderVersion = defaults.groupHeaderVersion;
    	      this.interchangeControlNumberLowerBound = defaults.interchangeControlNumberLowerBound;
    	      this.interchangeControlNumberUpperBound = defaults.interchangeControlNumberUpperBound;
    	      this.overwriteExistingTransactionSetControlNumber = defaults.overwriteExistingTransactionSetControlNumber;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.rolloverGroupControlNumber = defaults.rolloverGroupControlNumber;
    	      this.rolloverInterchangeControlNumber = defaults.rolloverInterchangeControlNumber;
    	      this.rolloverTransactionSetControlNumber = defaults.rolloverTransactionSetControlNumber;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.transactionSetControlNumberLowerBound = defaults.transactionSetControlNumberLowerBound;
    	      this.transactionSetControlNumberPrefix = defaults.transactionSetControlNumberPrefix;
    	      this.transactionSetControlNumberSuffix = defaults.transactionSetControlNumberSuffix;
    	      this.transactionSetControlNumberUpperBound = defaults.transactionSetControlNumberUpperBound;
    	      this.usageIndicator = defaults.usageIndicator;
    	      this.useControlStandardsIdAsRepetitionCharacter = defaults.useControlStandardsIdAsRepetitionCharacter;
        }

        public Builder setControlStandardsId(Input<Integer> controlStandardsId) {
            this.controlStandardsId = Objects.requireNonNull(controlStandardsId);
            return this;
        }

        public Builder setControlStandardsId(Integer controlStandardsId) {
            this.controlStandardsId = Input.of(Objects.requireNonNull(controlStandardsId));
            return this;
        }

        public Builder setControlVersionNumber(Input<String> controlVersionNumber) {
            this.controlVersionNumber = Objects.requireNonNull(controlVersionNumber);
            return this;
        }

        public Builder setControlVersionNumber(String controlVersionNumber) {
            this.controlVersionNumber = Input.of(Objects.requireNonNull(controlVersionNumber));
            return this;
        }

        public Builder setEnableDefaultGroupHeaders(Input<Boolean> enableDefaultGroupHeaders) {
            this.enableDefaultGroupHeaders = Objects.requireNonNull(enableDefaultGroupHeaders);
            return this;
        }

        public Builder setEnableDefaultGroupHeaders(Boolean enableDefaultGroupHeaders) {
            this.enableDefaultGroupHeaders = Input.of(Objects.requireNonNull(enableDefaultGroupHeaders));
            return this;
        }

        public Builder setFunctionalGroupId(@Nullable Input<String> functionalGroupId) {
            this.functionalGroupId = functionalGroupId;
            return this;
        }

        public Builder setFunctionalGroupId(@Nullable String functionalGroupId) {
            this.functionalGroupId = Input.ofNullable(functionalGroupId);
            return this;
        }

        public Builder setGroupControlNumberLowerBound(Input<Integer> groupControlNumberLowerBound) {
            this.groupControlNumberLowerBound = Objects.requireNonNull(groupControlNumberLowerBound);
            return this;
        }

        public Builder setGroupControlNumberLowerBound(Integer groupControlNumberLowerBound) {
            this.groupControlNumberLowerBound = Input.of(Objects.requireNonNull(groupControlNumberLowerBound));
            return this;
        }

        public Builder setGroupControlNumberUpperBound(Input<Integer> groupControlNumberUpperBound) {
            this.groupControlNumberUpperBound = Objects.requireNonNull(groupControlNumberUpperBound);
            return this;
        }

        public Builder setGroupControlNumberUpperBound(Integer groupControlNumberUpperBound) {
            this.groupControlNumberUpperBound = Input.of(Objects.requireNonNull(groupControlNumberUpperBound));
            return this;
        }

        public Builder setGroupHeaderAgencyCode(Input<String> groupHeaderAgencyCode) {
            this.groupHeaderAgencyCode = Objects.requireNonNull(groupHeaderAgencyCode);
            return this;
        }

        public Builder setGroupHeaderAgencyCode(String groupHeaderAgencyCode) {
            this.groupHeaderAgencyCode = Input.of(Objects.requireNonNull(groupHeaderAgencyCode));
            return this;
        }

        public Builder setGroupHeaderDateFormat(Input<Either<String,X12DateFormat>> groupHeaderDateFormat) {
            this.groupHeaderDateFormat = Objects.requireNonNull(groupHeaderDateFormat);
            return this;
        }

        public Builder setGroupHeaderDateFormat(Either<String,X12DateFormat> groupHeaderDateFormat) {
            this.groupHeaderDateFormat = Input.of(Objects.requireNonNull(groupHeaderDateFormat));
            return this;
        }

        public Builder setGroupHeaderTimeFormat(Input<Either<String,X12TimeFormat>> groupHeaderTimeFormat) {
            this.groupHeaderTimeFormat = Objects.requireNonNull(groupHeaderTimeFormat);
            return this;
        }

        public Builder setGroupHeaderTimeFormat(Either<String,X12TimeFormat> groupHeaderTimeFormat) {
            this.groupHeaderTimeFormat = Input.of(Objects.requireNonNull(groupHeaderTimeFormat));
            return this;
        }

        public Builder setGroupHeaderVersion(Input<String> groupHeaderVersion) {
            this.groupHeaderVersion = Objects.requireNonNull(groupHeaderVersion);
            return this;
        }

        public Builder setGroupHeaderVersion(String groupHeaderVersion) {
            this.groupHeaderVersion = Input.of(Objects.requireNonNull(groupHeaderVersion));
            return this;
        }

        public Builder setInterchangeControlNumberLowerBound(Input<Integer> interchangeControlNumberLowerBound) {
            this.interchangeControlNumberLowerBound = Objects.requireNonNull(interchangeControlNumberLowerBound);
            return this;
        }

        public Builder setInterchangeControlNumberLowerBound(Integer interchangeControlNumberLowerBound) {
            this.interchangeControlNumberLowerBound = Input.of(Objects.requireNonNull(interchangeControlNumberLowerBound));
            return this;
        }

        public Builder setInterchangeControlNumberUpperBound(Input<Integer> interchangeControlNumberUpperBound) {
            this.interchangeControlNumberUpperBound = Objects.requireNonNull(interchangeControlNumberUpperBound);
            return this;
        }

        public Builder setInterchangeControlNumberUpperBound(Integer interchangeControlNumberUpperBound) {
            this.interchangeControlNumberUpperBound = Input.of(Objects.requireNonNull(interchangeControlNumberUpperBound));
            return this;
        }

        public Builder setOverwriteExistingTransactionSetControlNumber(Input<Boolean> overwriteExistingTransactionSetControlNumber) {
            this.overwriteExistingTransactionSetControlNumber = Objects.requireNonNull(overwriteExistingTransactionSetControlNumber);
            return this;
        }

        public Builder setOverwriteExistingTransactionSetControlNumber(Boolean overwriteExistingTransactionSetControlNumber) {
            this.overwriteExistingTransactionSetControlNumber = Input.of(Objects.requireNonNull(overwriteExistingTransactionSetControlNumber));
            return this;
        }

        public Builder setReceiverApplicationId(Input<String> receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder setReceiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Input.of(Objects.requireNonNull(receiverApplicationId));
            return this;
        }

        public Builder setRolloverGroupControlNumber(Input<Boolean> rolloverGroupControlNumber) {
            this.rolloverGroupControlNumber = Objects.requireNonNull(rolloverGroupControlNumber);
            return this;
        }

        public Builder setRolloverGroupControlNumber(Boolean rolloverGroupControlNumber) {
            this.rolloverGroupControlNumber = Input.of(Objects.requireNonNull(rolloverGroupControlNumber));
            return this;
        }

        public Builder setRolloverInterchangeControlNumber(Input<Boolean> rolloverInterchangeControlNumber) {
            this.rolloverInterchangeControlNumber = Objects.requireNonNull(rolloverInterchangeControlNumber);
            return this;
        }

        public Builder setRolloverInterchangeControlNumber(Boolean rolloverInterchangeControlNumber) {
            this.rolloverInterchangeControlNumber = Input.of(Objects.requireNonNull(rolloverInterchangeControlNumber));
            return this;
        }

        public Builder setRolloverTransactionSetControlNumber(Input<Boolean> rolloverTransactionSetControlNumber) {
            this.rolloverTransactionSetControlNumber = Objects.requireNonNull(rolloverTransactionSetControlNumber);
            return this;
        }

        public Builder setRolloverTransactionSetControlNumber(Boolean rolloverTransactionSetControlNumber) {
            this.rolloverTransactionSetControlNumber = Input.of(Objects.requireNonNull(rolloverTransactionSetControlNumber));
            return this;
        }

        public Builder setSenderApplicationId(Input<String> senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder setSenderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Input.of(Objects.requireNonNull(senderApplicationId));
            return this;
        }

        public Builder setTransactionSetControlNumberLowerBound(Input<Integer> transactionSetControlNumberLowerBound) {
            this.transactionSetControlNumberLowerBound = Objects.requireNonNull(transactionSetControlNumberLowerBound);
            return this;
        }

        public Builder setTransactionSetControlNumberLowerBound(Integer transactionSetControlNumberLowerBound) {
            this.transactionSetControlNumberLowerBound = Input.of(Objects.requireNonNull(transactionSetControlNumberLowerBound));
            return this;
        }

        public Builder setTransactionSetControlNumberPrefix(@Nullable Input<String> transactionSetControlNumberPrefix) {
            this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
            return this;
        }

        public Builder setTransactionSetControlNumberPrefix(@Nullable String transactionSetControlNumberPrefix) {
            this.transactionSetControlNumberPrefix = Input.ofNullable(transactionSetControlNumberPrefix);
            return this;
        }

        public Builder setTransactionSetControlNumberSuffix(@Nullable Input<String> transactionSetControlNumberSuffix) {
            this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
            return this;
        }

        public Builder setTransactionSetControlNumberSuffix(@Nullable String transactionSetControlNumberSuffix) {
            this.transactionSetControlNumberSuffix = Input.ofNullable(transactionSetControlNumberSuffix);
            return this;
        }

        public Builder setTransactionSetControlNumberUpperBound(Input<Integer> transactionSetControlNumberUpperBound) {
            this.transactionSetControlNumberUpperBound = Objects.requireNonNull(transactionSetControlNumberUpperBound);
            return this;
        }

        public Builder setTransactionSetControlNumberUpperBound(Integer transactionSetControlNumberUpperBound) {
            this.transactionSetControlNumberUpperBound = Input.of(Objects.requireNonNull(transactionSetControlNumberUpperBound));
            return this;
        }

        public Builder setUsageIndicator(Input<Either<String,UsageIndicator>> usageIndicator) {
            this.usageIndicator = Objects.requireNonNull(usageIndicator);
            return this;
        }

        public Builder setUsageIndicator(Either<String,UsageIndicator> usageIndicator) {
            this.usageIndicator = Input.of(Objects.requireNonNull(usageIndicator));
            return this;
        }

        public Builder setUseControlStandardsIdAsRepetitionCharacter(Input<Boolean> useControlStandardsIdAsRepetitionCharacter) {
            this.useControlStandardsIdAsRepetitionCharacter = Objects.requireNonNull(useControlStandardsIdAsRepetitionCharacter);
            return this;
        }

        public Builder setUseControlStandardsIdAsRepetitionCharacter(Boolean useControlStandardsIdAsRepetitionCharacter) {
            this.useControlStandardsIdAsRepetitionCharacter = Input.of(Objects.requireNonNull(useControlStandardsIdAsRepetitionCharacter));
            return this;
        }

        public X12EnvelopeSettingsArgs build() {
            return new X12EnvelopeSettingsArgs(controlStandardsId, controlVersionNumber, enableDefaultGroupHeaders, functionalGroupId, groupControlNumberLowerBound, groupControlNumberUpperBound, groupHeaderAgencyCode, groupHeaderDateFormat, groupHeaderTimeFormat, groupHeaderVersion, interchangeControlNumberLowerBound, interchangeControlNumberUpperBound, overwriteExistingTransactionSetControlNumber, receiverApplicationId, rolloverGroupControlNumber, rolloverInterchangeControlNumber, rolloverTransactionSetControlNumber, senderApplicationId, transactionSetControlNumberLowerBound, transactionSetControlNumberPrefix, transactionSetControlNumberSuffix, transactionSetControlNumberUpperBound, usageIndicator, useControlStandardsIdAsRepetitionCharacter);
        }
    }
}

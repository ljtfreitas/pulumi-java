// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.MitigationActionAddThingsToThingGroupParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionEnableIoTLoggingParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionPublishFindingToSnsParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionReplaceDefaultPolicyVersionParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionUpdateCACertificateParams;
import io.pulumi.awsnative.iot.outputs.MitigationActionUpdateDeviceCertificateParams;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MitigationActionActionParams {
    private final @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams;
    private final @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams;
    private final @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams;
    private final @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;
    private final @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams;
    private final @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams;

    @CustomType.Constructor
    private MitigationActionActionParams(
        @CustomType.Parameter("addThingsToThingGroupParams") @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams,
        @CustomType.Parameter("enableIoTLoggingParams") @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams,
        @CustomType.Parameter("publishFindingToSnsParams") @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams,
        @CustomType.Parameter("replaceDefaultPolicyVersionParams") @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams,
        @CustomType.Parameter("updateCACertificateParams") @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams,
        @CustomType.Parameter("updateDeviceCertificateParams") @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams) {
        this.addThingsToThingGroupParams = addThingsToThingGroupParams;
        this.enableIoTLoggingParams = enableIoTLoggingParams;
        this.publishFindingToSnsParams = publishFindingToSnsParams;
        this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
        this.updateCACertificateParams = updateCACertificateParams;
        this.updateDeviceCertificateParams = updateDeviceCertificateParams;
    }

    public Optional<MitigationActionAddThingsToThingGroupParams> getAddThingsToThingGroupParams() {
        return Optional.ofNullable(this.addThingsToThingGroupParams);
    }
    public Optional<MitigationActionEnableIoTLoggingParams> getEnableIoTLoggingParams() {
        return Optional.ofNullable(this.enableIoTLoggingParams);
    }
    public Optional<MitigationActionPublishFindingToSnsParams> getPublishFindingToSnsParams() {
        return Optional.ofNullable(this.publishFindingToSnsParams);
    }
    public Optional<MitigationActionReplaceDefaultPolicyVersionParams> getReplaceDefaultPolicyVersionParams() {
        return Optional.ofNullable(this.replaceDefaultPolicyVersionParams);
    }
    public Optional<MitigationActionUpdateCACertificateParams> getUpdateCACertificateParams() {
        return Optional.ofNullable(this.updateCACertificateParams);
    }
    public Optional<MitigationActionUpdateDeviceCertificateParams> getUpdateDeviceCertificateParams() {
        return Optional.ofNullable(this.updateDeviceCertificateParams);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionActionParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams;
        private @Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams;
        private @Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams;
        private @Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams;
        private @Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams;
        private @Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionActionParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addThingsToThingGroupParams = defaults.addThingsToThingGroupParams;
    	      this.enableIoTLoggingParams = defaults.enableIoTLoggingParams;
    	      this.publishFindingToSnsParams = defaults.publishFindingToSnsParams;
    	      this.replaceDefaultPolicyVersionParams = defaults.replaceDefaultPolicyVersionParams;
    	      this.updateCACertificateParams = defaults.updateCACertificateParams;
    	      this.updateDeviceCertificateParams = defaults.updateDeviceCertificateParams;
        }

        public Builder addThingsToThingGroupParams(@Nullable MitigationActionAddThingsToThingGroupParams addThingsToThingGroupParams) {
            this.addThingsToThingGroupParams = addThingsToThingGroupParams;
            return this;
        }

        public Builder enableIoTLoggingParams(@Nullable MitigationActionEnableIoTLoggingParams enableIoTLoggingParams) {
            this.enableIoTLoggingParams = enableIoTLoggingParams;
            return this;
        }

        public Builder publishFindingToSnsParams(@Nullable MitigationActionPublishFindingToSnsParams publishFindingToSnsParams) {
            this.publishFindingToSnsParams = publishFindingToSnsParams;
            return this;
        }

        public Builder replaceDefaultPolicyVersionParams(@Nullable MitigationActionReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams) {
            this.replaceDefaultPolicyVersionParams = replaceDefaultPolicyVersionParams;
            return this;
        }

        public Builder updateCACertificateParams(@Nullable MitigationActionUpdateCACertificateParams updateCACertificateParams) {
            this.updateCACertificateParams = updateCACertificateParams;
            return this;
        }

        public Builder updateDeviceCertificateParams(@Nullable MitigationActionUpdateDeviceCertificateParams updateDeviceCertificateParams) {
            this.updateDeviceCertificateParams = updateDeviceCertificateParams;
            return this;
        }
        public MitigationActionActionParams build() {
            return new MitigationActionActionParams(addThingsToThingGroupParams, enableIoTLoggingParams, publishFindingToSnsParams, replaceDefaultPolicyVersionParams, updateCACertificateParams, updateDeviceCertificateParams);
        }
    }
}

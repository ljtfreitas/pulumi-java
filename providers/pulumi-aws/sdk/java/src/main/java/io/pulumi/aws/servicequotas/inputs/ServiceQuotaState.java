// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicequotas.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceQuotaState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceQuotaState Empty = new ServiceQuotaState();

    /**
     * Whether the service quota can be increased.
     * 
     */
    @InputImport(name="adjustable")
    private final @Nullable Input<Boolean> adjustable;

    public Input<Boolean> getAdjustable() {
        return this.adjustable == null ? Input.empty() : this.adjustable;
    }

    /**
     * Amazon Resource Name (ARN) of the service quota.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Default value of the service quota.
     * 
     */
    @InputImport(name="defaultValue")
    private final @Nullable Input<Double> defaultValue;

    public Input<Double> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    /**
     * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
     * 
     */
    @InputImport(name="quotaCode")
    private final @Nullable Input<String> quotaCode;

    public Input<String> getQuotaCode() {
        return this.quotaCode == null ? Input.empty() : this.quotaCode;
    }

    /**
     * Name of the quota.
     * 
     */
    @InputImport(name="quotaName")
    private final @Nullable Input<String> quotaName;

    public Input<String> getQuotaName() {
        return this.quotaName == null ? Input.empty() : this.quotaName;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="requestStatus")
    private final @Nullable Input<String> requestStatus;

    public Input<String> getRequestStatus() {
        return this.requestStatus == null ? Input.empty() : this.requestStatus;
    }

    /**
     * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @InputImport(name="serviceCode")
    private final @Nullable Input<String> serviceCode;

    public Input<String> getServiceCode() {
        return this.serviceCode == null ? Input.empty() : this.serviceCode;
    }

    /**
     * Name of the service.
     * 
     */
    @InputImport(name="serviceName")
    private final @Nullable Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName == null ? Input.empty() : this.serviceName;
    }

    /**
     * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<Double> value;

    public Input<Double> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ServiceQuotaState(
        @Nullable Input<Boolean> adjustable,
        @Nullable Input<String> arn,
        @Nullable Input<Double> defaultValue,
        @Nullable Input<String> quotaCode,
        @Nullable Input<String> quotaName,
        @Nullable Input<String> requestId,
        @Nullable Input<String> requestStatus,
        @Nullable Input<String> serviceCode,
        @Nullable Input<String> serviceName,
        @Nullable Input<Double> value) {
        this.adjustable = adjustable;
        this.arn = arn;
        this.defaultValue = defaultValue;
        this.quotaCode = quotaCode;
        this.quotaName = quotaName;
        this.requestId = requestId;
        this.requestStatus = requestStatus;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.value = value;
    }

    private ServiceQuotaState() {
        this.adjustable = Input.empty();
        this.arn = Input.empty();
        this.defaultValue = Input.empty();
        this.quotaCode = Input.empty();
        this.quotaName = Input.empty();
        this.requestId = Input.empty();
        this.requestStatus = Input.empty();
        this.serviceCode = Input.empty();
        this.serviceName = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceQuotaState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> adjustable;
        private @Nullable Input<String> arn;
        private @Nullable Input<Double> defaultValue;
        private @Nullable Input<String> quotaCode;
        private @Nullable Input<String> quotaName;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> requestStatus;
        private @Nullable Input<String> serviceCode;
        private @Nullable Input<String> serviceName;
        private @Nullable Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceQuotaState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustable = defaults.adjustable;
    	      this.arn = defaults.arn;
    	      this.defaultValue = defaults.defaultValue;
    	      this.quotaCode = defaults.quotaCode;
    	      this.quotaName = defaults.quotaName;
    	      this.requestId = defaults.requestId;
    	      this.requestStatus = defaults.requestStatus;
    	      this.serviceCode = defaults.serviceCode;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder setAdjustable(@Nullable Input<Boolean> adjustable) {
            this.adjustable = adjustable;
            return this;
        }

        public Builder setAdjustable(@Nullable Boolean adjustable) {
            this.adjustable = Input.ofNullable(adjustable);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDefaultValue(@Nullable Input<Double> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable Double defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public Builder setQuotaCode(@Nullable Input<String> quotaCode) {
            this.quotaCode = quotaCode;
            return this;
        }

        public Builder setQuotaCode(@Nullable String quotaCode) {
            this.quotaCode = Input.ofNullable(quotaCode);
            return this;
        }

        public Builder setQuotaName(@Nullable Input<String> quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        public Builder setQuotaName(@Nullable String quotaName) {
            this.quotaName = Input.ofNullable(quotaName);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setRequestStatus(@Nullable Input<String> requestStatus) {
            this.requestStatus = requestStatus;
            return this;
        }

        public Builder setRequestStatus(@Nullable String requestStatus) {
            this.requestStatus = Input.ofNullable(requestStatus);
            return this;
        }

        public Builder setServiceCode(@Nullable Input<String> serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }

        public Builder setServiceCode(@Nullable String serviceCode) {
            this.serviceCode = Input.ofNullable(serviceCode);
            return this;
        }

        public Builder setServiceName(@Nullable Input<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder setServiceName(@Nullable String serviceName) {
            this.serviceName = Input.ofNullable(serviceName);
            return this;
        }

        public Builder setValue(@Nullable Input<Double> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public ServiceQuotaState build() {
            return new ServiceQuotaState(adjustable, arn, defaultValue, quotaCode, quotaName, requestId, requestStatus, serviceCode, serviceName, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPredictionModelStatusResult {
    /**
     * The model status message.
     * 
     */
    private final String message;
    /**
     * Version of the model.
     * 
     */
    private final String modelVersion;
    /**
     * The prediction GUID ID.
     * 
     */
    private final String predictionGuidId;
    /**
     * The prediction name.
     * 
     */
    private final String predictionName;
    /**
     * The signals used.
     * 
     */
    private final Integer signalsUsed;
    /**
     * Prediction model life cycle.  When prediction is in PendingModelConfirmation status, it is allowed to update the status to PendingFeaturing or Active through API.
     * 
     */
    private final String status;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Count of the test set.
     * 
     */
    private final Integer testSetCount;
    /**
     * The training accuracy.
     * 
     */
    private final Integer trainingAccuracy;
    /**
     * Count of the training set.
     * 
     */
    private final Integer trainingSetCount;
    /**
     * Count of the validation set.
     * 
     */
    private final Integer validationSetCount;

    @CustomType.Constructor
    private GetPredictionModelStatusResult(
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("modelVersion") String modelVersion,
        @CustomType.Parameter("predictionGuidId") String predictionGuidId,
        @CustomType.Parameter("predictionName") String predictionName,
        @CustomType.Parameter("signalsUsed") Integer signalsUsed,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("testSetCount") Integer testSetCount,
        @CustomType.Parameter("trainingAccuracy") Integer trainingAccuracy,
        @CustomType.Parameter("trainingSetCount") Integer trainingSetCount,
        @CustomType.Parameter("validationSetCount") Integer validationSetCount) {
        this.message = message;
        this.modelVersion = modelVersion;
        this.predictionGuidId = predictionGuidId;
        this.predictionName = predictionName;
        this.signalsUsed = signalsUsed;
        this.status = status;
        this.tenantId = tenantId;
        this.testSetCount = testSetCount;
        this.trainingAccuracy = trainingAccuracy;
        this.trainingSetCount = trainingSetCount;
        this.validationSetCount = validationSetCount;
    }

    /**
     * The model status message.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * Version of the model.
     * 
    */
    public String getModelVersion() {
        return this.modelVersion;
    }
    /**
     * The prediction GUID ID.
     * 
    */
    public String getPredictionGuidId() {
        return this.predictionGuidId;
    }
    /**
     * The prediction name.
     * 
    */
    public String getPredictionName() {
        return this.predictionName;
    }
    /**
     * The signals used.
     * 
    */
    public Integer getSignalsUsed() {
        return this.signalsUsed;
    }
    /**
     * Prediction model life cycle.  When prediction is in PendingModelConfirmation status, it is allowed to update the status to PendingFeaturing or Active through API.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The hub name.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Count of the test set.
     * 
    */
    public Integer getTestSetCount() {
        return this.testSetCount;
    }
    /**
     * The training accuracy.
     * 
    */
    public Integer getTrainingAccuracy() {
        return this.trainingAccuracy;
    }
    /**
     * Count of the training set.
     * 
    */
    public Integer getTrainingSetCount() {
        return this.trainingSetCount;
    }
    /**
     * Count of the validation set.
     * 
    */
    public Integer getValidationSetCount() {
        return this.validationSetCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPredictionModelStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String message;
        private String modelVersion;
        private String predictionGuidId;
        private String predictionName;
        private Integer signalsUsed;
        private String status;
        private String tenantId;
        private Integer testSetCount;
        private Integer trainingAccuracy;
        private Integer trainingSetCount;
        private Integer validationSetCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPredictionModelStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.modelVersion = defaults.modelVersion;
    	      this.predictionGuidId = defaults.predictionGuidId;
    	      this.predictionName = defaults.predictionName;
    	      this.signalsUsed = defaults.signalsUsed;
    	      this.status = defaults.status;
    	      this.tenantId = defaults.tenantId;
    	      this.testSetCount = defaults.testSetCount;
    	      this.trainingAccuracy = defaults.trainingAccuracy;
    	      this.trainingSetCount = defaults.trainingSetCount;
    	      this.validationSetCount = defaults.validationSetCount;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }

        public Builder predictionGuidId(String predictionGuidId) {
            this.predictionGuidId = Objects.requireNonNull(predictionGuidId);
            return this;
        }

        public Builder predictionName(String predictionName) {
            this.predictionName = Objects.requireNonNull(predictionName);
            return this;
        }

        public Builder signalsUsed(Integer signalsUsed) {
            this.signalsUsed = Objects.requireNonNull(signalsUsed);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder testSetCount(Integer testSetCount) {
            this.testSetCount = Objects.requireNonNull(testSetCount);
            return this;
        }

        public Builder trainingAccuracy(Integer trainingAccuracy) {
            this.trainingAccuracy = Objects.requireNonNull(trainingAccuracy);
            return this;
        }

        public Builder trainingSetCount(Integer trainingSetCount) {
            this.trainingSetCount = Objects.requireNonNull(trainingSetCount);
            return this;
        }

        public Builder validationSetCount(Integer validationSetCount) {
            this.validationSetCount = Objects.requireNonNull(validationSetCount);
            return this;
        }
        public GetPredictionModelStatusResult build() {
            return new GetPredictionModelStatusResult(message, modelVersion, predictionGuidId, predictionName, signalsUsed, status, tenantId, testSetCount, trainingAccuracy, trainingSetCount, validationSetCount);
        }
    }
}

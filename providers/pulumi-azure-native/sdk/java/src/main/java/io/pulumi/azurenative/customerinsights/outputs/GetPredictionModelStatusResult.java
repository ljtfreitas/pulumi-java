// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"message","modelVersion","predictionGuidId","predictionName","signalsUsed","status","tenantId","testSetCount","trainingAccuracy","trainingSetCount","validationSetCount"})
    private GetPredictionModelStatusResult(
        String message,
        String modelVersion,
        String predictionGuidId,
        String predictionName,
        Integer signalsUsed,
        String status,
        String tenantId,
        Integer testSetCount,
        Integer trainingAccuracy,
        Integer trainingSetCount,
        Integer validationSetCount) {
        this.message = Objects.requireNonNull(message);
        this.modelVersion = Objects.requireNonNull(modelVersion);
        this.predictionGuidId = Objects.requireNonNull(predictionGuidId);
        this.predictionName = Objects.requireNonNull(predictionName);
        this.signalsUsed = Objects.requireNonNull(signalsUsed);
        this.status = Objects.requireNonNull(status);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.testSetCount = Objects.requireNonNull(testSetCount);
        this.trainingAccuracy = Objects.requireNonNull(trainingAccuracy);
        this.trainingSetCount = Objects.requireNonNull(trainingSetCount);
        this.validationSetCount = Objects.requireNonNull(validationSetCount);
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

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setModelVersion(String modelVersion) {
            this.modelVersion = Objects.requireNonNull(modelVersion);
            return this;
        }

        public Builder setPredictionGuidId(String predictionGuidId) {
            this.predictionGuidId = Objects.requireNonNull(predictionGuidId);
            return this;
        }

        public Builder setPredictionName(String predictionName) {
            this.predictionName = Objects.requireNonNull(predictionName);
            return this;
        }

        public Builder setSignalsUsed(Integer signalsUsed) {
            this.signalsUsed = Objects.requireNonNull(signalsUsed);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTestSetCount(Integer testSetCount) {
            this.testSetCount = Objects.requireNonNull(testSetCount);
            return this;
        }

        public Builder setTrainingAccuracy(Integer trainingAccuracy) {
            this.trainingAccuracy = Objects.requireNonNull(trainingAccuracy);
            return this;
        }

        public Builder setTrainingSetCount(Integer trainingSetCount) {
            this.trainingSetCount = Objects.requireNonNull(trainingSetCount);
            return this;
        }

        public Builder setValidationSetCount(Integer validationSetCount) {
            this.validationSetCount = Objects.requireNonNull(validationSetCount);
            return this;
        }
        public GetPredictionModelStatusResult build() {
            return new GetPredictionModelStatusResult(message, modelVersion, predictionGuidId, predictionName, signalsUsed, status, tenantId, testSetCount, trainingAccuracy, trainingSetCount, validationSetCount);
        }
    }
}

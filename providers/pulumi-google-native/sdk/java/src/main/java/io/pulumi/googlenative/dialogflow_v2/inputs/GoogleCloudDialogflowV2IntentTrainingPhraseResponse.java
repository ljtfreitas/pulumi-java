// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudDialogflowV2IntentTrainingPhraseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentTrainingPhraseResponse Empty = new GoogleCloudDialogflowV2IntentTrainingPhraseResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="parts", required=true)
    private final List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts;

    public List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> getParts() {
        return this.parts;
    }

    @InputImport(name="timesAddedCount", required=true)
    private final Integer timesAddedCount;

    public Integer getTimesAddedCount() {
        return this.timesAddedCount;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudDialogflowV2IntentTrainingPhraseResponse(
        String name,
        List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts,
        Integer timesAddedCount,
        String type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.timesAddedCount = Objects.requireNonNull(timesAddedCount, "expected parameter 'timesAddedCount' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentTrainingPhraseResponse() {
        this.name = null;
        this.parts = List.of();
        this.timesAddedCount = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhraseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts;
        private Integer timesAddedCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhraseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parts = defaults.parts;
    	      this.timesAddedCount = defaults.timesAddedCount;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParts(List<GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setTimesAddedCount(Integer timesAddedCount) {
            this.timesAddedCount = Objects.requireNonNull(timesAddedCount);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudDialogflowV2IntentTrainingPhraseResponse build() {
            return new GoogleCloudDialogflowV2IntentTrainingPhraseResponse(name, parts, timesAddedCount, type);
        }
    }
}
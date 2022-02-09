// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SegmentResponse {
    private final Map<String,String> fields;
    private final String segmentId;
    private final String setId;

    @OutputCustomType.Constructor({"fields","segmentId","setId"})
    private SegmentResponse(
        Map<String,String> fields,
        String segmentId,
        String setId) {
        this.fields = Objects.requireNonNull(fields);
        this.segmentId = Objects.requireNonNull(segmentId);
        this.setId = Objects.requireNonNull(setId);
    }

    public Map<String,String> getFields() {
        return this.fields;
    }
    public String getSegmentId() {
        return this.segmentId;
    }
    public String getSetId() {
        return this.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fields;
        private String segmentId;
        private String setId;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.segmentId = defaults.segmentId;
    	      this.setId = defaults.setId;
        }

        public Builder setFields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setSegmentId(String segmentId) {
            this.segmentId = Objects.requireNonNull(segmentId);
            return this;
        }

        public Builder setSetId(String setId) {
            this.setId = Objects.requireNonNull(setId);
            return this;
        }

        public SegmentResponse build() {
            return new SegmentResponse(fields, segmentId, setId);
        }
    }
}
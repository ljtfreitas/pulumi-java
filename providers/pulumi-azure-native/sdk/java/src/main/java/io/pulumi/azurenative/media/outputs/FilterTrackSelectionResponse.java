// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.FilterTrackPropertyConditionResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FilterTrackSelectionResponse {
    /**
     * The track selections.
     * 
     */
    private final List<FilterTrackPropertyConditionResponse> trackSelections;

    @CustomType.Constructor
    private FilterTrackSelectionResponse(@CustomType.Parameter("trackSelections") List<FilterTrackPropertyConditionResponse> trackSelections) {
        this.trackSelections = trackSelections;
    }

    /**
     * The track selections.
     * 
    */
    public List<FilterTrackPropertyConditionResponse> getTrackSelections() {
        return this.trackSelections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterTrackSelectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilterTrackPropertyConditionResponse> trackSelections;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterTrackSelectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackSelections = defaults.trackSelections;
        }

        public Builder trackSelections(List<FilterTrackPropertyConditionResponse> trackSelections) {
            this.trackSelections = Objects.requireNonNull(trackSelections);
            return this;
        }
        public FilterTrackSelectionResponse build() {
            return new FilterTrackSelectionResponse(trackSelections);
        }
    }
}

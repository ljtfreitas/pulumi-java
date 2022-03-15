// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse {
    /**
     * Optional. List of cells that make up this row.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells;
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
     */
    private final Boolean dividerAfter;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse(
        @CustomType.Parameter("cells") List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells,
        @CustomType.Parameter("dividerAfter") Boolean dividerAfter) {
        this.cells = cells;
        this.dividerAfter = dividerAfter;
    }

    /**
     * Optional. List of cells that make up this row.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> getCells() {
        return this.cells;
    }
    /**
     * Optional. Whether to add a visual divider after this row.
     * 
    */
    public Boolean getDividerAfter() {
        return this.dividerAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells;
        private Boolean dividerAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.dividerAfter = defaults.dividerAfter;
        }

        public Builder cells(List<GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse> cells) {
            this.cells = Objects.requireNonNull(cells);
            return this;
        }

        public Builder dividerAfter(Boolean dividerAfter) {
            this.dividerAfter = Objects.requireNonNull(dividerAfter);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardRowResponse(cells, dividerAfter);
        }
    }
}

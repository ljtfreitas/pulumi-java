// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormParameterArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A form is a data model that groups related parameters that can be collected from the user. The process in which the agent prompts the user and collects parameter values from the user is called form filling. A form can be added to a page. When form filling is done, the filled parameters will be written to the session.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FormArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FormArgs Empty = new GoogleCloudDialogflowCxV3beta1FormArgs();

    /**
     * Parameters to collect from the user.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FormParameterArgs>> parameters;

    public Input<List<GoogleCloudDialogflowCxV3beta1FormParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    public GoogleCloudDialogflowCxV3beta1FormArgs(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1FormParameterArgs>> parameters) {
        this.parameters = parameters;
    }

    private GoogleCloudDialogflowCxV3beta1FormArgs() {
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FormArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FormParameterArgs>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FormArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
        }

        public Builder setParameters(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1FormParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<GoogleCloudDialogflowCxV3beta1FormParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FormArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FormArgs(parameters);
        }
    }
}

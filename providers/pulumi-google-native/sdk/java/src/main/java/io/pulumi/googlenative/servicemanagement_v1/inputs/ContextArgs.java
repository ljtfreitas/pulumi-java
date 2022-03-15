// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.ContextRuleArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `Context` defines which contexts an API requests. Example: context: rules: - selector: "*" requested: - google.rpc.context.ProjectContext - google.rpc.context.OriginContext The above specifies that all methods in the API request `google.rpc.context.ProjectContext` and `google.rpc.context.OriginContext`. Available context types are defined in package `google.rpc.context`. This also provides mechanism to allowlist any protobuf message extension that can be sent in grpc metadata using “x-goog-ext--bin” and “x-goog-ext--jspb” format. For example, list any service specific protobuf types that can appear in grpc metadata as follows in your yaml file: Example: context: rules: - selector: "google.example.library.v1.LibraryService.CreateBook" allowed_request_extensions: - google.foo.v1.NewExtension allowed_response_extensions: - google.foo.v1.NewExtension You can also specify extension ID instead of fully qualified extension name here.
 * 
 */
public final class ContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContextArgs Empty = new ContextArgs();

    /**
     * A list of RPC context rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<ContextRuleArgs>> rules;

    public Output<List<ContextRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    public ContextArgs(@Nullable Output<List<ContextRuleArgs>> rules) {
        this.rules = rules;
    }

    private ContextArgs() {
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ContextRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(@Nullable Output<List<ContextRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<ContextRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public ContextArgs build() {
            return new ContextArgs(rules);
        }
    }
}

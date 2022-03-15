// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator;

import io.pulumi.awsnative.globalaccelerator.enums.ListenerClientAffinity;
import io.pulumi.awsnative.globalaccelerator.enums.ListenerProtocol;
import io.pulumi.awsnative.globalaccelerator.inputs.ListenerPortRangeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * The Amazon Resource Name (ARN) of the accelerator.
     * 
     */
    @Import(name="acceleratorArn", required=true)
      private final Output<String> acceleratorArn;

    public Output<String> getAcceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * Client affinity lets you direct all requests from a user to the same endpoint.
     * 
     */
    @Import(name="clientAffinity")
      private final @Nullable Output<ListenerClientAffinity> clientAffinity;

    public Output<ListenerClientAffinity> getClientAffinity() {
        return this.clientAffinity == null ? Output.empty() : this.clientAffinity;
    }

    @Import(name="portRanges", required=true)
      private final Output<List<ListenerPortRangeArgs>> portRanges;

    public Output<List<ListenerPortRangeArgs>> getPortRanges() {
        return this.portRanges;
    }

    /**
     * The protocol for the listener.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<ListenerProtocol> protocol;

    public Output<ListenerProtocol> getProtocol() {
        return this.protocol;
    }

    public ListenerArgs(
        Output<String> acceleratorArn,
        @Nullable Output<ListenerClientAffinity> clientAffinity,
        Output<List<ListenerPortRangeArgs>> portRanges,
        Output<ListenerProtocol> protocol) {
        this.acceleratorArn = Objects.requireNonNull(acceleratorArn, "expected parameter 'acceleratorArn' to be non-null");
        this.clientAffinity = clientAffinity;
        this.portRanges = Objects.requireNonNull(portRanges, "expected parameter 'portRanges' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private ListenerArgs() {
        this.acceleratorArn = Output.empty();
        this.clientAffinity = Output.empty();
        this.portRanges = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> acceleratorArn;
        private @Nullable Output<ListenerClientAffinity> clientAffinity;
        private Output<List<ListenerPortRangeArgs>> portRanges;
        private Output<ListenerProtocol> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder acceleratorArn(Output<String> acceleratorArn) {
            this.acceleratorArn = Objects.requireNonNull(acceleratorArn);
            return this;
        }

        public Builder acceleratorArn(String acceleratorArn) {
            this.acceleratorArn = Output.of(Objects.requireNonNull(acceleratorArn));
            return this;
        }

        public Builder clientAffinity(@Nullable Output<ListenerClientAffinity> clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        public Builder clientAffinity(@Nullable ListenerClientAffinity clientAffinity) {
            this.clientAffinity = Output.ofNullable(clientAffinity);
            return this;
        }

        public Builder portRanges(Output<List<ListenerPortRangeArgs>> portRanges) {
            this.portRanges = Objects.requireNonNull(portRanges);
            return this;
        }

        public Builder portRanges(List<ListenerPortRangeArgs> portRanges) {
            this.portRanges = Output.of(Objects.requireNonNull(portRanges));
            return this;
        }

        public Builder protocol(Output<ListenerProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(ListenerProtocol protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public ListenerArgs build() {
            return new ListenerArgs(acceleratorArn, clientAffinity, portRanges, protocol);
        }
    }
}

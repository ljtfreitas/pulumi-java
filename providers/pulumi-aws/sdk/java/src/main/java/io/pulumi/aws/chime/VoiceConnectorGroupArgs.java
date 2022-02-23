// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime;

import io.pulumi.aws.chime.inputs.VoiceConnectorGroupConnectorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VoiceConnectorGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceConnectorGroupArgs Empty = new VoiceConnectorGroupArgs();

    /**
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * 
     */
    @InputImport(name="connectors")
    private final @Nullable Input<List<VoiceConnectorGroupConnectorArgs>> connectors;

    public Input<List<VoiceConnectorGroupConnectorArgs>> getConnectors() {
        return this.connectors == null ? Input.empty() : this.connectors;
    }

    /**
     * The name of the Amazon Chime Voice Connector group.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public VoiceConnectorGroupArgs(
        @Nullable Input<List<VoiceConnectorGroupConnectorArgs>> connectors,
        @Nullable Input<String> name) {
        this.connectors = connectors;
        this.name = name;
    }

    private VoiceConnectorGroupArgs() {
        this.connectors = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VoiceConnectorGroupConnectorArgs>> connectors;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectors = defaults.connectors;
    	      this.name = defaults.name;
        }

        public Builder setConnectors(@Nullable Input<List<VoiceConnectorGroupConnectorArgs>> connectors) {
            this.connectors = connectors;
            return this;
        }

        public Builder setConnectors(@Nullable List<VoiceConnectorGroupConnectorArgs> connectors) {
            this.connectors = Input.ofNullable(connectors);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public VoiceConnectorGroupArgs build() {
            return new VoiceConnectorGroupArgs(connectors, name);
        }
    }
}

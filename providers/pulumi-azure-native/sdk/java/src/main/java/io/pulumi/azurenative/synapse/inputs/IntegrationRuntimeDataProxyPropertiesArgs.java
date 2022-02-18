// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.EntityReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data proxy properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeDataProxyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeDataProxyPropertiesArgs Empty = new IntegrationRuntimeDataProxyPropertiesArgs();

    /**
     * The self-hosted integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable Input<EntityReferenceArgs> connectVia;

    public Input<EntityReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * The path to contain the staged data in the Blob storage.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * The staging linked service reference.
     * 
     */
    @InputImport(name="stagingLinkedService")
    private final @Nullable Input<EntityReferenceArgs> stagingLinkedService;

    public Input<EntityReferenceArgs> getStagingLinkedService() {
        return this.stagingLinkedService == null ? Input.empty() : this.stagingLinkedService;
    }

    public IntegrationRuntimeDataProxyPropertiesArgs(
        @Nullable Input<EntityReferenceArgs> connectVia,
        @Nullable Input<String> path,
        @Nullable Input<EntityReferenceArgs> stagingLinkedService) {
        this.connectVia = connectVia;
        this.path = path;
        this.stagingLinkedService = stagingLinkedService;
    }

    private IntegrationRuntimeDataProxyPropertiesArgs() {
        this.connectVia = Input.empty();
        this.path = Input.empty();
        this.stagingLinkedService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataProxyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EntityReferenceArgs> connectVia;
        private @Nullable Input<String> path;
        private @Nullable Input<EntityReferenceArgs> stagingLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataProxyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.path = defaults.path;
    	      this.stagingLinkedService = defaults.stagingLinkedService;
        }

        public Builder setConnectVia(@Nullable Input<EntityReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable EntityReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setStagingLinkedService(@Nullable Input<EntityReferenceArgs> stagingLinkedService) {
            this.stagingLinkedService = stagingLinkedService;
            return this;
        }

        public Builder setStagingLinkedService(@Nullable EntityReferenceArgs stagingLinkedService) {
            this.stagingLinkedService = Input.ofNullable(stagingLinkedService);
            return this;
        }

        public IntegrationRuntimeDataProxyPropertiesArgs build() {
            return new IntegrationRuntimeDataProxyPropertiesArgs(connectVia, path, stagingLinkedService);
        }
    }
}

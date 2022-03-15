// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifying this parameter adds support for reliable collections
 * 
 */
public final class ReliableCollectionsRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReliableCollectionsRefArgs Empty = new ReliableCollectionsRefArgs();

    /**
     * False (the default) if ReliableCollections state is persisted to disk as usual. True if you do not want to persist state, in which case replication is still enabled and you can use ReliableCollections as distributed cache.
     * 
     */
    @Import(name="doNotPersistState")
      private final @Nullable Output<Boolean> doNotPersistState;

    public Output<Boolean> getDoNotPersistState() {
        return this.doNotPersistState == null ? Output.empty() : this.doNotPersistState;
    }

    /**
     * Name of ReliableCollection resource. Right now it's not used and you can use any string.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ReliableCollectionsRefArgs(
        @Nullable Output<Boolean> doNotPersistState,
        Output<String> name) {
        this.doNotPersistState = doNotPersistState;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReliableCollectionsRefArgs() {
        this.doNotPersistState = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReliableCollectionsRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> doNotPersistState;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReliableCollectionsRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotPersistState = defaults.doNotPersistState;
    	      this.name = defaults.name;
        }

        public Builder doNotPersistState(@Nullable Output<Boolean> doNotPersistState) {
            this.doNotPersistState = doNotPersistState;
            return this;
        }

        public Builder doNotPersistState(@Nullable Boolean doNotPersistState) {
            this.doNotPersistState = Output.ofNullable(doNotPersistState);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public ReliableCollectionsRefArgs build() {
            return new ReliableCollectionsRefArgs(doNotPersistState, name);
        }
    }
}

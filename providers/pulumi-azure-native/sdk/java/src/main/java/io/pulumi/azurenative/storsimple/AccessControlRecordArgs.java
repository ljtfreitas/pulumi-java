// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.enums.Kind;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessControlRecordArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessControlRecordArgs Empty = new AccessControlRecordArgs();

    /**
     * The name of the access control record.
     * 
     */
    @InputImport(name="accessControlRecordName")
        private final @Nullable Input<String> accessControlRecordName;

    public Input<String> getAccessControlRecordName() {
        return this.accessControlRecordName == null ? Input.empty() : this.accessControlRecordName;
    }

    /**
     * The iSCSI initiator name (IQN).
     * 
     */
    @InputImport(name="initiatorName", required=true)
        private final Input<String> initiatorName;

    public Input<String> getInitiatorName() {
        return this.initiatorName;
    }

    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @InputImport(name="kind")
        private final @Nullable Input<Kind> kind;

    public Input<Kind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The manager name
     * 
     */
    @InputImport(name="managerName", required=true)
        private final Input<String> managerName;

    public Input<String> getManagerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public AccessControlRecordArgs(
        @Nullable Input<String> accessControlRecordName,
        Input<String> initiatorName,
        @Nullable Input<Kind> kind,
        Input<String> managerName,
        Input<String> resourceGroupName) {
        this.accessControlRecordName = accessControlRecordName;
        this.initiatorName = Objects.requireNonNull(initiatorName, "expected parameter 'initiatorName' to be non-null");
        this.kind = kind;
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private AccessControlRecordArgs() {
        this.accessControlRecordName = Input.empty();
        this.initiatorName = Input.empty();
        this.kind = Input.empty();
        this.managerName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessControlRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessControlRecordName;
        private Input<String> initiatorName;
        private @Nullable Input<Kind> kind;
        private Input<String> managerName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessControlRecordArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlRecordName = defaults.accessControlRecordName;
    	      this.initiatorName = defaults.initiatorName;
    	      this.kind = defaults.kind;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccessControlRecordName(@Nullable Input<String> accessControlRecordName) {
            this.accessControlRecordName = accessControlRecordName;
            return this;
        }

        public Builder setAccessControlRecordName(@Nullable String accessControlRecordName) {
            this.accessControlRecordName = Input.ofNullable(accessControlRecordName);
            return this;
        }

        public Builder setInitiatorName(Input<String> initiatorName) {
            this.initiatorName = Objects.requireNonNull(initiatorName);
            return this;
        }

        public Builder setInitiatorName(String initiatorName) {
            this.initiatorName = Input.of(Objects.requireNonNull(initiatorName));
            return this;
        }

        public Builder setKind(@Nullable Input<Kind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Kind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setManagerName(Input<String> managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Input.of(Objects.requireNonNull(managerName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public AccessControlRecordArgs build() {
            return new AccessControlRecordArgs(accessControlRecordName, initiatorName, kind, managerName, resourceGroupName);
        }
    }
}

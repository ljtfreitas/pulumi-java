// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.LockLevel;
import io.pulumi.azurenative.authorization.inputs.ManagementLockOwnerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementLockByScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementLockByScopeArgs Empty = new ManagementLockByScopeArgs();

    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it.
     * 
     */
    @InputImport(name="level", required=true)
    private final Input<Either<String,LockLevel>> level;

    public Input<Either<String,LockLevel>> getLevel() {
        return this.level;
    }

    /**
     * The name of lock.
     * 
     */
    @InputImport(name="lockName")
    private final @Nullable Input<String> lockName;

    public Input<String> getLockName() {
        return this.lockName == null ? Input.empty() : this.lockName;
    }

    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @InputImport(name="notes")
    private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * The owners of the lock.
     * 
     */
    @InputImport(name="owners")
    private final @Nullable Input<List<ManagementLockOwnerArgs>> owners;

    public Input<List<ManagementLockOwnerArgs>> getOwners() {
        return this.owners == null ? Input.empty() : this.owners;
    }

    /**
     * The scope for the lock. When providing a scope for the assignment, use '/subscriptions/{subscriptionId}' for subscriptions, '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}' for resource groups, and '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePathIfPresent}/{resourceType}/{resourceName}' for resources.
     * 
     */
    @InputImport(name="scope", required=true)
    private final Input<String> scope;

    public Input<String> getScope() {
        return this.scope;
    }

    public ManagementLockByScopeArgs(
        Input<Either<String,LockLevel>> level,
        @Nullable Input<String> lockName,
        @Nullable Input<String> notes,
        @Nullable Input<List<ManagementLockOwnerArgs>> owners,
        Input<String> scope) {
        this.level = Objects.requireNonNull(level, "expected parameter 'level' to be non-null");
        this.lockName = lockName;
        this.notes = notes;
        this.owners = owners;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private ManagementLockByScopeArgs() {
        this.level = Input.empty();
        this.lockName = Input.empty();
        this.notes = Input.empty();
        this.owners = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementLockByScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,LockLevel>> level;
        private @Nullable Input<String> lockName;
        private @Nullable Input<String> notes;
        private @Nullable Input<List<ManagementLockOwnerArgs>> owners;
        private Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementLockByScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.lockName = defaults.lockName;
    	      this.notes = defaults.notes;
    	      this.owners = defaults.owners;
    	      this.scope = defaults.scope;
        }

        public Builder setLevel(Input<Either<String,LockLevel>> level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setLevel(Either<String,LockLevel> level) {
            this.level = Input.of(Objects.requireNonNull(level));
            return this;
        }

        public Builder setLockName(@Nullable Input<String> lockName) {
            this.lockName = lockName;
            return this;
        }

        public Builder setLockName(@Nullable String lockName) {
            this.lockName = Input.ofNullable(lockName);
            return this;
        }

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setOwners(@Nullable Input<List<ManagementLockOwnerArgs>> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setOwners(@Nullable List<ManagementLockOwnerArgs> owners) {
            this.owners = Input.ofNullable(owners);
            return this;
        }

        public Builder setScope(Input<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public ManagementLockByScopeArgs build() {
            return new ManagementLockByScopeArgs(level, lockName, notes, owners, scope);
        }
    }
}

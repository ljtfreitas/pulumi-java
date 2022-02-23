// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.outputs;

import io.pulumi.aws.backup.outputs.PlanRuleCopyAction;
import io.pulumi.aws.backup.outputs.PlanRuleLifecycle;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PlanRule {
    /**
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * 
     */
    private final @Nullable Integer completionWindow;
    /**
     * Configuration block(s) with copy operation settings. Detailed below.
     * 
     */
    private final @Nullable List<PlanRuleCopyAction> copyActions;
    /**
     * Enable continuous backups for supported resources.
     * 
     */
    private final @Nullable Boolean enableContinuousBackup;
    /**
     * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    private final @Nullable PlanRuleLifecycle lifecycle;
    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    private final @Nullable Map<String,String> recoveryPointTags;
    /**
     * An display name for a backup rule.
     * 
     */
    private final String ruleName;
    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * 
     */
    private final @Nullable String schedule;
    /**
     * The amount of time in minutes before beginning a backup.
     * 
     */
    private final @Nullable Integer startWindow;
    /**
     * The name of a logical container where backups are stored.
     * 
     */
    private final String targetVaultName;

    @OutputCustomType.Constructor({"completionWindow","copyActions","enableContinuousBackup","lifecycle","recoveryPointTags","ruleName","schedule","startWindow","targetVaultName"})
    private PlanRule(
        @Nullable Integer completionWindow,
        @Nullable List<PlanRuleCopyAction> copyActions,
        @Nullable Boolean enableContinuousBackup,
        @Nullable PlanRuleLifecycle lifecycle,
        @Nullable Map<String,String> recoveryPointTags,
        String ruleName,
        @Nullable String schedule,
        @Nullable Integer startWindow,
        String targetVaultName) {
        this.completionWindow = completionWindow;
        this.copyActions = copyActions;
        this.enableContinuousBackup = enableContinuousBackup;
        this.lifecycle = lifecycle;
        this.recoveryPointTags = recoveryPointTags;
        this.ruleName = Objects.requireNonNull(ruleName);
        this.schedule = schedule;
        this.startWindow = startWindow;
        this.targetVaultName = Objects.requireNonNull(targetVaultName);
    }

    /**
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * 
     */
    public Optional<Integer> getCompletionWindow() {
        return Optional.ofNullable(this.completionWindow);
    }
    /**
     * Configuration block(s) with copy operation settings. Detailed below.
     * 
     */
    public List<PlanRuleCopyAction> getCopyActions() {
        return this.copyActions == null ? List.of() : this.copyActions;
    }
    /**
     * Enable continuous backups for supported resources.
     * 
     */
    public Optional<Boolean> getEnableContinuousBackup() {
        return Optional.ofNullable(this.enableContinuousBackup);
    }
    /**
     * The lifecycle defines when a protected resource is copied over to a backup vault and when it expires.  Fields documented above.
     * 
     */
    public Optional<PlanRuleLifecycle> getLifecycle() {
        return Optional.ofNullable(this.lifecycle);
    }
    /**
     * Metadata that you can assign to help organize the resources that you create.
     * 
     */
    public Map<String,String> getRecoveryPointTags() {
        return this.recoveryPointTags == null ? Map.of() : this.recoveryPointTags;
    }
    /**
     * An display name for a backup rule.
     * 
     */
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * 
     */
    public Optional<String> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * The amount of time in minutes before beginning a backup.
     * 
     */
    public Optional<Integer> getStartWindow() {
        return Optional.ofNullable(this.startWindow);
    }
    /**
     * The name of a logical container where backups are stored.
     * 
     */
    public String getTargetVaultName() {
        return this.targetVaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer completionWindow;
        private @Nullable List<PlanRuleCopyAction> copyActions;
        private @Nullable Boolean enableContinuousBackup;
        private @Nullable PlanRuleLifecycle lifecycle;
        private @Nullable Map<String,String> recoveryPointTags;
        private String ruleName;
        private @Nullable String schedule;
        private @Nullable Integer startWindow;
        private String targetVaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionWindow = defaults.completionWindow;
    	      this.copyActions = defaults.copyActions;
    	      this.enableContinuousBackup = defaults.enableContinuousBackup;
    	      this.lifecycle = defaults.lifecycle;
    	      this.recoveryPointTags = defaults.recoveryPointTags;
    	      this.ruleName = defaults.ruleName;
    	      this.schedule = defaults.schedule;
    	      this.startWindow = defaults.startWindow;
    	      this.targetVaultName = defaults.targetVaultName;
        }

        public Builder setCompletionWindow(@Nullable Integer completionWindow) {
            this.completionWindow = completionWindow;
            return this;
        }

        public Builder setCopyActions(@Nullable List<PlanRuleCopyAction> copyActions) {
            this.copyActions = copyActions;
            return this;
        }

        public Builder setEnableContinuousBackup(@Nullable Boolean enableContinuousBackup) {
            this.enableContinuousBackup = enableContinuousBackup;
            return this;
        }

        public Builder setLifecycle(@Nullable PlanRuleLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder setRecoveryPointTags(@Nullable Map<String,String> recoveryPointTags) {
            this.recoveryPointTags = recoveryPointTags;
            return this;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setStartWindow(@Nullable Integer startWindow) {
            this.startWindow = startWindow;
            return this;
        }

        public Builder setTargetVaultName(String targetVaultName) {
            this.targetVaultName = Objects.requireNonNull(targetVaultName);
            return this;
        }
        public PlanRule build() {
            return new PlanRule(completionWindow, copyActions, enableContinuousBackup, lifecycle, recoveryPointTags, ruleName, schedule, startWindow, targetVaultName);
        }
    }
}